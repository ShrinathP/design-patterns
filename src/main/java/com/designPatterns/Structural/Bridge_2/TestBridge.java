package com.designPatterns.Structural.Bridge_2;

import org.bson.assertions.Assertions;

public class TestBridge {
    public static void main(String[] args) {
        Shape square = new Square(new Red());
        System.out.println(square.draw() +"\n");
        System.out.println("\n");
        System.out.println("Square drawn. Color is Red");

    }
}
