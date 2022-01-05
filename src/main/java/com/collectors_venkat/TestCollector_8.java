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

    }
}
