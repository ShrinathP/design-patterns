package com.designPatterns.Structural.Bridge_2;

//Using Composition. an implementation of Color interface

//HAS A- Shape HAS A Color
public abstract class Shape {
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract String draw();

}
