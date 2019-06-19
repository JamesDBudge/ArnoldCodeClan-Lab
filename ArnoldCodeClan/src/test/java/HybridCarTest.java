import Car.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before() {
        hybridCar = new HybridCar("Toyota", "Prius", 50000, "Silver", "75kW Electric/150hp petrol");
    }

    @Test
    public void canGetMake() {
        assertEquals("Toyota", hybridCar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Prius", hybridCar.getModel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(50000, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Silver", hybridCar.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals("75kW Electric/150hp petrol", hybridCar.getEngine());
    }


    @Test
    public void drive() {
        assertEquals("I'm riding electricity and explosions!", hybridCar.drive());
    }
}
