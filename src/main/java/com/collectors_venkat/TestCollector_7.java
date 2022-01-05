package com.collectors_venkat;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import static com.collectors_venkat.TestCollector_1.createPeople;

public class TestCollector_7 {

    public static void main(String[] args) {

        //Example 24
        //FlatMap
        //for one to may functions
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        //one-to-one function
        System.out.println(numbers.stream()
                .map(e -> e * 2)
                .collect(toList()));
        //Stream<T>.map(f 1-2-1) ==> Stream<R>

        //one-to-many function - flattening required
        System.out.println(numbers.stream()
                .map(e -> List.of(e - 1, e + 1))
                .collect(toList()));
        //Stream<T>.map(f 1-2-n) ==> Stream<List<R>>

        //Flatmap - first runs map then runs flatten
        //Flatmap - needs an iterator over R
        //Used in cases like given a List of person, give me list of email addresses
        //Person can have many email addresses
        System.out.println(numbers.stream()
                //flatMap with Function returning List will not work
                //.flatMap(e -> List.of(e - 1, e + 1))
                .collect(toList()));

        //NOTE : Pass Iterator/ Stream inside a flatmap
        //you cannot pass List or Map or Collection etc
        //doesnt work, below
        //.flatMap(Function<T, Map<R>>) ===> Stream<R>
        //.flatMap(Function<T, List<R>>) ===> Stream<R>

        //RETURN STREAM FOR FLATMAP
        //.flatMap(Function<T, Iterator<R>>) ===> Stream<R>
        //OR
        //.flatMap(Function<T, Stream<R>>) ===> Stream<R>
        System.out.println(numbers.stream()
                .flatMap(e -> List.of(e - 1, e + 1).stream())
                .collect(toList()));

        System.out.println(numbers.stream()
                .flatMap(e -> Stream.of(e - 1, e + 1))
                .collect(toList()));

        //Logic
        //If you have  a one-to-one function use map to go from
        //Stream<T> ==> Stream<R>

        //If you have  a one-to-many function use map to go from
        //Stream<T> ==> Stream<Collection<R>>

        //If you have  a one-to-many function use flatMap to go from
        //Stream<T> ==> Stream<<R>>

    }
}
