package com.designPatterns.B_Mediator;

//Mediator Interface
public interface Mediator {
  public void send(String message, Colleague colleague);
}
