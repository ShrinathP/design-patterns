package com.solidPrinciples.openClosed.DuckFly;

public class Fly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Normal Duck Fly");
    }
}
