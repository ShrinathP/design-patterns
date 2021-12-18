package com.designPatterns.Creational.Factory_without_switch;

public class DieselCar implements Car{
    private String brand;

    public DieselCar(String brand) {
        this.brand = brand;
    }

    @Override
    public void createCar() {

    }
}
