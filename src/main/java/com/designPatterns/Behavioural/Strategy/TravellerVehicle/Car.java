package com.designPatterns.Behavioural.Strategy.TravellerVehicle;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}