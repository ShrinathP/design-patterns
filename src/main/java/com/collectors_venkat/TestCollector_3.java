package com.collectors_venkat;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

import static com.collectors_venkat.TestCollector_1.createPeople;


public class TestCollector_3 {

    public static void main(String[] args) {

        //Example 8
        //partitioningBy
        System.out.println(
                createPeople().stream()
                        .collect(partitioningBy(person -> person.getAge() > 30))
        );

        //Example 9
        //groupingBy
        //group people based on their name
        //groupingBy always gives a Map
        //NOTE: mapping asks what you want, List or Map or Set
        Map<String, List<Person>> result =
                createPeople().stream()
                        .collect(groupingBy(person -> person.getName()));
        System.out.println(result);

        //Example 10
        //groupingBy with List of ages only

        //groupingBy comes in 2 flavors
        //groupingBy(Function<T, R>) ==> Collector
        //groupingBy(Function<t,R>, Collector)

        //3 collectors - grouping, mapping, toList
        //Collector(Function, Collector(Function, Collector))
        Map<String, List<Integer>> res =
                createPeople().stream()
                        //groupingBy (Function<T, R>, Collector)
                        .collect(groupingBy(person -> person.getName(),
                                mapping(person -> person.getAge(), toList())));
        System.out.println(res);

        //NOTE groupingBy assumes it needs a list , it automatically groups into Map of Lists
        //while mapping needs toList

        //Example 11
        //Set of Ages
        Map<String, Set<Integer>> ageSet =
                createPeople().stream()
                        //groupingBy (Function<T, R>, Collector)
                        .collect(groupingBy(person -> person.getName(),
                                mapping(person -> person.getAge(), toSet())));
        System.out.println(ageSet);


    }
}
