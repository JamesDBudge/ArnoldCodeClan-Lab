package Dealership;

import Car.ElectricCar;
import Car.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private ElectricCar electricCar;
    private PetrolCar car;

    @Before
    public void before() {
        dealership = new Dealership("Peter Vardy");
        electricCar = new ElectricCar("Tesla", "Model X", 90000, "Black", "200kW");
    }


    @Test
    public void getName() {
        assertEquals("Peter Vardy", dealership.getName());
    }

    @Test
    public void addCar() {
        dealership.addCar(electricCar);
        assertEquals(1, dealership.returnCarSize());
    }

    @Test
    public void canBuyVehicle() {
        Till till = new Till(10000);
        assertEquals(0, dealership.returnCarSize());

        car = new PetrolCar("SEAT", "IBIZA", 1000, "Black", "1.4L Petrol");
        dealership.buy(car, till);

        assertEquals(1, dealership.returnCarSize());
        assertEquals(9000, till.getMoney(), 0.01);
    }

}
