package com.collectors_venkat;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import static com.collectors_venkat.TestCollector_1.createPeople;

public class TestCollector_2 {
    public static void main(String[] args) {

        //Example 6 , Collecting to a map
        createPeople().stream()
                //toMap(keyFunction, valueFunction)
                .collect(toMap(Person::getName, Person::getAge));

        //Example 7,
        // use toUnmodifiableList, toUnmodifiableMap, toUnmodifiableSet (from Java 10)
        //instead of toList, toMap, toSet
        //so that the created Map is not modifiable
        Map<String, Integer> result = createPeople().stream()
                //toMap(keyFunction, valueFunction)
                .collect(toUnmodifiableMap(Person::getName, Person::getAge));


        //Example 8, joining
        System.out.println(
        createPeople().stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(joining(", "))
        );


    }
}
