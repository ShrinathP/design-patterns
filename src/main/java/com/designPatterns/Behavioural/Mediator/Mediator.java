package com.designPatterns.Behavioural.Mediator;

//Mediator Interface
public interface Mediator {
  public void send(String message, Colleague colleague);
}
