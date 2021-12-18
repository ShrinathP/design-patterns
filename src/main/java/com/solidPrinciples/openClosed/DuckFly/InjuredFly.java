package com.solidPrinciples.openClosed.DuckFly;

public class InjuredFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("This duck cannot fly");
    }
}
