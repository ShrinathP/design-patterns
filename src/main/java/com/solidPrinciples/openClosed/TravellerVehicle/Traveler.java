package com.solidPrinciples.openClosed.TravellerVehicle;

//Same as behavioural Strategy Pattern/ Bridge Pattern(but bridge has 2 interfaces)
//Check Strategy Pattern,

//Traveler Using Composition, an implementation of Vehicle Interface
//Same as in Bridge_2 Design Pattern

//HAS A- Traveler HAS A Vehicle

public class Traveler {
    private Vehicle v;
    public Vehicle getV() {
        return v;
    }
    public void setV(Vehicle v) {
        this.v = v;
    }

    public void startJourney() {
        v.move();
    }
}