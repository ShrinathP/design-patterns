package com.designPatterns.Structural.Decorator;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("Creating Simple Shape Objects...");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        System.out.println("Creating Decorated Circle with Red Color, Blue Lines in dash pattern and thickness of 2 ...");
        Shape circle1 = new LineStyleDecorator(new FillColorDecorator(new Circle(), Color.RED), LineStyle.DASH);
        circle1.draw();
        System.out.println();

    }
}
