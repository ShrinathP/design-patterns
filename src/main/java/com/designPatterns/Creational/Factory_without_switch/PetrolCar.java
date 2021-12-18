package com.designPatterns.Creational.Factory_without_switch;

public class PetrolCar implements Car{
    private String brand;

    public PetrolCar(String brand) {
        this.brand = brand;
    }

    @Override
    public void createCar() {

    }
}
