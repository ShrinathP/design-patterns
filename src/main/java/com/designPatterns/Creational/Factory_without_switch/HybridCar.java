package com.designPatterns.Creational.Factory_without_switch;

public class ElectricalCar implements Car{
    private String brand;

    public ElectricalCar(String brand) {
        this.brand = brand;
    }

    @Override
    public void createCar() {

    }
}
