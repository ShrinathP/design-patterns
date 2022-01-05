package com.collectors_venkat;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import static com.collectors_venkat.TestCollector_1.createPeople;


public class TestCollector_4 {
    public static void main(String[] args) {

        //Example 12
        //groupBy name with count as values
        Map<String, Long> countByName = createPeople().stream()
                .collect(groupingBy(Person::getName, counting()));

        System.out.println(countByName);

        //Example 13,
        // collectingAndThen takes a collector first then runs the function
        //suppose you do not want the count in Longs
        //instead want integer
        //grouping and mapping ==>  (Function, Collector)
        //collectingAndThen ==>     (Collector, Function)
        Map<String, Integer> countByNameInt = createPeople().stream()
                .collect(groupingBy(Person::getName,
                        collectingAndThen(counting(), Long::intValue
        )));
        System.out.println(countByNameInt);

        //reduce ==> reduce, collect, sum

        //Example 14
        //sum, max, min
        //note max, min returns an optional
        System.out.println(
                createPeople().stream()
                        .mapToInt(Person::getAge)
                        .max()
        );

        //Example 15 maxBy, minBy
        //maxBy takes a comparator, eg comparing
        //returns an optional
        Optional<Person> s = createPeople().stream()
.collect(maxBy(comparing(Person::getAge)));

        System.out.println(
                createPeople().stream()
                .collect(maxBy(comparing(Person::getAge)))
        );

        Comparator<Person> descendingComparator = (p1, p2) -> p2.getAge() - p1.getAge();
        System.out.println(
                createPeople().stream()
                        .collect(maxBy(descendingComparator))
        );
    }
}
