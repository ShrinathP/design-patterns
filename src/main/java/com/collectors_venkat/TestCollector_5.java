package com.collectors_venkat;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import static com.collectors_venkat.TestCollector_1.createPeople;

public class TestCollector_5 {
    public static void main(String[] args) {

        //Example 16
        //get maxBy age, but collect only name of maxBy
        String result =
                createPeople().stream()
                        .collect(collectingAndThen(maxBy(comparing(Person::getAge)),
                                //maxBy returns an optional
                                //optional map method
                                person -> person.map(Person::getName).orElse("")));
        System.out.println(result);

        //Example 17
        //IMP
        //Used in E2E
        //Get Maxes of each Metric type
        //Get Max ages of each name
        System.out.println(
                createPeople().stream()
                        .collect(groupingBy(Person::getName,
                                maxBy(Comparator.comparing(Person::getAge))))
        );

        //Used in E2E
        //Get Maxes of each Metric type
        //Example 18, removing Optionals in Example 17
        //maxBy returns an Optional
        //IMP
        //BinaryOperator.maxBy
        //Grouping By and get max Person Objects only, no Optionals
        Map<String, Person> s =
                createPeople().stream()
                        .collect(groupingBy(Person::getName,
                                collectingAndThen(maxBy(comparing(Person::getAge)),
                                        person -> person.orElse(new Person("shrinath", 20))
                                )));
        System.out.println(s);

        //Example 19
        //Can use toMap also for the same Example 18
        //toMap uses keyMapper, valueMapper, MergeFunction
        //NOTE. there are 2 maxBys
        //Collectors.maxBy
        //BinaryOperator maxBy
        //toMap needs BinaryOperator maxBy
        Map<String, Person> mapWithMaxAgesForTheName = createPeople().stream()
                .collect(toMap(Person::getName, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Person::getAge))));
        System.out.println(mapWithMaxAgesForTheName);
        //NOTE
        //Function.identity()  is same as p -> p


        //Example 20 ,
        //Writing your own BinaryOperator maxBy BiFunction
        Map<String, Person> mapWithMaxAgesForTheName2 = createPeople().stream()
                .collect(toMap(Person::getName, Function.identity(),
                        //Writing maxBy logic for which values to collect
                        (firstAddedAge, newAge) -> {
                            if (firstAddedAge.getAge() > newAge.getAge()) {
                                return firstAddedAge;
                            }
                            return newAge;
                        }));
        System.out.println(mapWithMaxAgesForTheName2);


        //Example 21 , BinaryOperator is a BiFunction
        //Map merge function, where existing value is kept as it is
        Map<String, Person> mapWithNonReplaceableAges = createPeople().stream()
                .collect(toMap(Person::getName, Function.identity(),
                        (firstAddedAge, newAge) -> firstAddedAge));
        System.out.println(mapWithNonReplaceableAges);



//

    }
}
