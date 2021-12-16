package com.designPatterns.Structural.Decorator;

public class FillColorDecorator extends ShapeDecorator {
    protected Color color;

    public FillColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;

    }

    @Override
    public void draw() {
        //draw shape from super
        decoratedShape.draw();
        //extra work done in Fill Decorator
        System.out.println("Fill Color" + color);

    }
    // no change in the functionality, call all methods of super Shape Implementor
    // we can add in the functionality if we like. there is no restriction
    @Override
    public void resize() {
        decoratedShape.resize();

    }

    @Override
    public String description() {
        return decoratedShape.description() + " filled with color "+  color + "color.";
    }

    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}
