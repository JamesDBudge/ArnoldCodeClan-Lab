package Dealership;

import behaviours.IHandleMoney;

public class Till implements IHandleMoney {

    private double money;

    public Till(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }



    public double reduceMoney(double amount) {
        money -= amount;
        return money;
    }

    public double increaseMoney(double amount) {
        money += amount;
        return money;
    }
}
