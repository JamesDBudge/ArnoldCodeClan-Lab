package Car;

import Car.ElectricCar;
import behaviours.IDriveable;

public class PetrolCar extends Car implements IDriveable {

    public PetrolCar(String make, String model, double price, String colour, String engine){
        super(make, model, price, colour, engine);
    }

    public String drive() {
        return "I'm drinking dinosaur bones!";
    }
}
