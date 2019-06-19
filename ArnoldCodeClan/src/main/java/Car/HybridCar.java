package Car;

import Car.HybridCar;
import behaviours.IDriveable;

public class HybridCar extends Car implements IDriveable {

    public HybridCar(String make, String model, double price, String colour, String engine){
        super(make, model, price, colour, engine);
    }

    public String drive() {
        return "I'm riding electricity and explosions!";
    }

}
