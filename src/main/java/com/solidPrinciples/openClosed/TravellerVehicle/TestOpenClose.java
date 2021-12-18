package com.solidPrinciples.openClosed.TravellerVehicle;

public class TestOpenClose {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setV(new Car()); // Inject Car dependency
        traveler.startJourney(); // start journey by Car
        traveler.setV(new Bike()); // Inject Bike dependency
        traveler.startJourney(); // Start journey by Bike
    }
}
