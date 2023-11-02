package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine{
  private static VendingMachineImpl instance;
  private int money;
  private String drink;

  private VendingMachineImpl(){
    this.money = 0;
  }

  public static VendingMachine getInstance() {
    if(instance == null){
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  @Override
  public void insertQuarter() {
    this.money += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if ("ScottCola".equals(name)) {
      if (this.money < 75) {
        throw new NotEnoughMoneyException();
      }
      this.money -= 75;
      return new DrinkImpl("ScottCola", true);
    }
    if ("KarenTea".equals(name)) {
      if (this.money < 100) {
        throw new NotEnoughMoneyException();
      }
      this.money -= 100;
      return new DrinkImpl("KarenTea", false);
    }
      else {
        throw new UnknownDrinkException();
    }
  }
}
