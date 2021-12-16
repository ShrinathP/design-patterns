package com.designPatterns.Structural.Decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    //Abstract Class with Constructor Taking Implementation of Shape
    public ShapeDecorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }

}
