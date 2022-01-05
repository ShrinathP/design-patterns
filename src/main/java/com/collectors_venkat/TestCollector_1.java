package com.collectors_venkat;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;

public class TestCollector_1 {
    public static List<Person> createPeople() {
        return List.of(
                new Person("Sara", 20),
                new Person("Sara", 22),
                new Person("Bob", 20),
                new Person("Paula", 32),
                new Person("Paul", 32),
                new Person("Jack", 3),
                new Person("Jack", 72),
                new Person("Jill", 11)
        );

    }


    public static void main(String[] args) {

        //Example 1
        //reduce
        System.out.println(
                createPeople().stream()
                        .map(Person::getAge)
                        .reduce(0, (total, age) -> total + age)
        );

        //Example 2
        //reduce with method reference
        System.out.println(
                createPeople().stream()
                        .map(Person::getAge)
                        .reduce(0, Integer::sum)
        );


    /*
    1. Streams are Lazy Evaluations, until you do not collect or store into something
    streams would not be evaluated
    2. In order to get lazily evaluated, all functions in the stream should be pure
    function
    */
        //Example 3
        //Don't do this (Using impure function inside reduce)
        List<String> namesOlderThan30 = new ArrayList<>();

        createPeople().stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                //impure function, takes arrayList and mutates it
                .forEach(name -> namesOlderThan30.add(name));
        System.out.println(namesOlderThan30);

        //Above is ok but
        //When you make it parallel, then all names wont be
        //added to the namesOlderThan30 list sometimes
        //due to race condition
        List<String> namesOlderThan30Parallel = new ArrayList<>();

        createPeople().parallelStream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                //impure function, takes arrayList and mutates it
                .forEach(name -> namesOlderThan30Parallel.add(name));
        System.out.println(namesOlderThan30Parallel);

        //Example 4
        //Using reduce instead of forEach
        //reduce uses local mutability, immutable from external
        createPeople().parallelStream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                //reduce takes 3 arguments
                //1 initializer
                //2. accumulator (Bi function)
                //takes 2 parameters, initializer and iterator
                //3. combiner, to combine results of all parallelStream
                .reduce(
                        new ArrayList<String>(),
                        (names, name) -> {
                            names.add(name);
                            return names;
                        },
                        (names1, names2) -> {
                            names1.addAll(names2);
                            return names1;
                        }
                );

        //Example 5
        //Using collect instead of reduce
        //collect is actually a reduce operation
        createPeople().parallelStream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                //reduce takes 3 arguments
                //1 initializer
                //2. accumulator (Bi function)
                //takes 2 parameters, initializer and iterator
                //3. combiner, to combine results of all parallelStream
                .collect(toList());
    }

}
