package com.designPatterns.Behavioural.Strategy.Z_StrategyLambdas;

import java.util.Arrays;
import java.util.List;

public class StrategyOnSteriods {
    public static void main(String[] args) {

        System.out.println("Strategy pattern on Steroids");

        List<Strategy> strategies =
                Arrays.asList(
                        () -> {System.out.println("Perform task a day before deadline!");},
                        () -> {System.out.println("Perform task now!");}
                );

        strategies.forEach(Strategy::performTask);
    }
}
