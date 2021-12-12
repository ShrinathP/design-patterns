package com.designPatterns.Behavioural.Strategy.TravellerVehicle;

public class Test {
    public static void main(String[] args) {
        Traveller traveler = new Traveller();
        traveler.setV(new Car()); // Inject Car dependency
        traveler.startJourney(); // start journey by Car
        traveler.setV(new Bike()); // Inject Bike dependency
        traveler.startJourney(); // Start journey by Bike
    }
}
