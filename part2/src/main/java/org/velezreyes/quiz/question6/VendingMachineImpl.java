package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine{
  private static VendingMachineImpl instance;
  private int money;
  private String drink;

  private VendingMachineImpl(){
    this.money = 0;
    this.drink = null;
  }

  public static VendingMachine getInstance() {
    if(instance == null){
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  @Override
  public void insertQuarter() {

  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    return null;
  }
}
