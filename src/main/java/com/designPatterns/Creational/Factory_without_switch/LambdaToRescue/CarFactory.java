package com.designPatterns.Creational.Factory_without_switch.LambdaToRescue;

import com.designPatterns.Creational.Factory_without_switch.*;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

//https://www.javaguides.net/2018/10/factory-pattern-using-java-8-lambda-expressions.html
//https://ahmadatwi.me/2019/04/16/factory-pattern-replacing-the-conditional-statement-with-lambda-expressions/
public class CarFactory {
    private CarFactory() {
    }

    //Functional Interface
    private static final Map<String, CarCreator> CAR_FACTORY_MAP = ImmutableMap.of(
            "Diesel", brand -> new DieselCar(brand),
            "Electrical", brand -> new ElectricalCar(brand),
            "Hybrid", brand -> new HybridCar(brand),
            "Petrol", brand -> new PetrolCar(brand)
    );

    static Car getCar(String type, String brand) {
        if (CAR_FACTORY_MAP.containsKey(type)) {
            return CAR_FACTORY_MAP.get(type).initialize(brand);
        }
        throw new UnsupportedOperationException();
    }

    private interface CarCreator {
        Car initialize(String brand);
    }
}