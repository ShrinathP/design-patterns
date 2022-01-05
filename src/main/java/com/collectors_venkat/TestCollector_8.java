package com.collectors_venkat;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import static com.collectors_venkat.TestCollector_1.createPeople;

public class TestCollector_8 {
    public static void main(String[] args) {

        //flatMapping Example
        //Used for flattening the List inside a Map

        //Example 26
        //get names of same ages
        Map<Integer, List<String>> s = createPeople().stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getName, toList())));
        System.out.println(
                createPeople().stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getName, toList())))
        );


        //Example 27
        //get all chars in the names of same ages
        //Use flatMapping
        System.out.println(createPeople().stream()
                .collect(groupingBy(Person::getAge,
                        flatMapping(person -> Stream.of(person.getName().split("")), toList()))));

        Map<Integer, List<Object>> stringMap = createPeople().stream()
                .collect(groupingBy(Person::getAge,
                        flatMapping(person -> Stream.of(person.getName().split("")), toList())));
        System.out.println(stringMap);

        //Example 28
        //getting all uppercase characters in the names of same ages
        System.out.println(createPeople().stream()
                .collect(groupingBy(Person::getAge,
                        mapping(person -> person.getName().toUpperCase(),
                        flatMapping(name -> Stream.of(name.split("")), toList())))));


        //Summary
        //reduce -> sum, max, min, reduce, collect

        //collect(Collector)

        //Collectors

        //toList, toMap, toSet
        //toUnmodifieableList, toUnmodifieableMap, etc

        //partitioningBy

        //groupingBy(Function<T, R>)
        //groupingBy(Function, Collector)
        //mapping(Function, Collector)

        //collectingAndThen(Collector, Function)

        //Check TestCollector_ 5 examples, collectingAndThen(maxBy)
        //toMap(Function keyMapper, Function valueMapper, BinaryOperator)

        //teeing(Collector, Collector, Operator)

        //flatMap(Function<T, Stream<R>>)

        //flatMapping(Function<T, Stream<R>>)

    }
}
