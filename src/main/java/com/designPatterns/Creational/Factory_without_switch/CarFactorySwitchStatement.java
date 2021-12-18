package com.designPatterns.Creational.Factory_without_switch;

public class CarFactorySwitchStatement {

    private CarFactorySwitchStatement() {
    }

    static Car getCar(String type, String brand) {
        switch (type) {
            case "Diesel":
                return new DieselCar(brand);
            case "Electrical":
                return new ElectricalCar(brand);
            case "Hybrid":
                return new HybridCar(brand);
            case "Petrol":
                return new PetrolCar(brand);
            default:
                throw new UnsupportedOperationException();
        }
    }
}