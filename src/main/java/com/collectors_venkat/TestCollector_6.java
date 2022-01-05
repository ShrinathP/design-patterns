package com.collectors_venkat;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import static com.collectors_venkat.TestCollector_1.createPeople;

public class TestCollector_6 {
    public static void main(String[] args) {

        //Example 21
        Map<Integer, List<String>> mapList = createPeople().stream()
                .collect(groupingBy(Person::getAge, mapping(Person::getName, toList())));
        System.out.println(mapList);

        //Example 22 extension of above
        // filtering
        //used to filter the values based on some function
        System.out.println(
                createPeople().stream()
                        .collect(groupingBy(Person::getAge, mapping(Person::getName,
                                filtering(name -> name.length()>4, toList()))))
        );

        //Example 22 //teeing
        //From Java 12
        //grouping, mapping (Function , Collector)
        //collectingAndThen (Collector, Function)
        //teeing (Collector, Collector, BiFunction)
        //teeing allows you to run multiple collectors


    }
}
