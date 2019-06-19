package Dealership;

import Car.Car;
import behaviours.IHandleCars;
import behaviours.IHandleMoney;

import java.util.ArrayList;

public class Customer implements IHandleMoney, IHandleCars {

    private String name;
    private double wallet;
    private ArrayList<Car> ownedCars;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.ownedCars = new ArrayList<Car>();
    }


    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public Car addCar(Car car){
        this.ownedCars.add(car);
        return car;
    }

    public int getCarsSize(){
        return ownedCars.size();
    }

    public double reduceMoney(double amount) {
        wallet -= amount;
        return wallet;
    }

    public double increaseMoney(double amount) {
        wallet += amount;
        return wallet;
    }

    public Car removeCar() {
        return this.ownedCars.remove(0);
    }
}
