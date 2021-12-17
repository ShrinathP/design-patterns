package com.designPatterns.Creational.Factory_without_switch.LambdaToRescue;

import com.designPatterns.Creational.Factory_without_switch.Car;

private interface CarCreator {
    Car initialize(String brand);
}