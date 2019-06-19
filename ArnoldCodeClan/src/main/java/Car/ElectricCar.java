package Car;

import Car.ElectricCar;
import behaviours.IDriveable;

public class ElectricCar extends Car implements IDriveable {

    public ElectricCar(String make, String model, double price, String colour, String engine){
        super(make, model, price, colour, engine);
    }

    public String drive() {
        return "I'm riding a wave of electricity!";
    }

}
