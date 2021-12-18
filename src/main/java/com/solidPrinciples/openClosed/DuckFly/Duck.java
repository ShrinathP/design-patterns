package com.solidPrinciples.openClosed.DuckFly;

//Same as behavioural Strategy Pattern/ Bridge Pattern(but bridge has 2 interfaces)

//Duck Using Composition, an implementation of Fly Interface
//Same as in Bridge_2 Design Pattern

//HAS A- Duck HAS A Fly Strategy

public class Duck {
    private Fly fly;

    public Duck(Fly fly){
        this.fly = fly;
    }

    public String getUnderlyingFly(){
        return fly.getClass().getCanonicalName();
    }

    public void move(){
        fly.fly();
    }
}
