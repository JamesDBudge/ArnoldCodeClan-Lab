package Dealership;

import Car.Car;
import Dealership.Till;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private ArrayList cars;

    public Dealership(String name){
        this.name = name;
        this.cars = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public int returnCarSize() {
        return cars.size();
    }

    public void buy(Car car, Till till) {
        addCar(car);
        till.reduceMoney(car.getPrice());
    }




}
