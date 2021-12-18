package com.solidPrinciples.openClosed.DuckFly;

public class MigrationFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Migration Duck Fly");
    }
}
