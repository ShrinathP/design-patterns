package com.designPatterns.Structural.Bridge_2;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
