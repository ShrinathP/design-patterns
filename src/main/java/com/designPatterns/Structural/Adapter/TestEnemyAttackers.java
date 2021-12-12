package com.designPatterns.Structural.Adapter;

public class TestEnemyAttackers{

    public static void main(String[] args){

        EnemyTankNew rx7Tank = new EnemyTankNew();

        EnemyRobotLegacy fredTheRobot = new EnemyRobotLegacy();

        EnemyAttackerNew robotAdapter = new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");

        fredTheRobot.reactToHuman("Paul");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }

}