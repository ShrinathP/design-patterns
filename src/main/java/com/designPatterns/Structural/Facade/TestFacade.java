package com.designPatterns.Structural.Facade;


public class TestFacade {

    public static void main(String[] args){

        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(990.00);

    }

}