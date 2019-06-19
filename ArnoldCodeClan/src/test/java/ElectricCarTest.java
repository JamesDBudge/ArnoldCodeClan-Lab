import Car.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new ElectricCar("Tesla", "Model 3", 80000, "Red", "175kW Electric");
    }

    @Test
    public void canGetMake() {
        assertEquals("Tesla", electricCar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Model 3", electricCar.getModel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(80000, electricCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Red", electricCar.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals("175kW Electric", electricCar.getEngine());
    }


    @Test
    public void drive() {
        assertEquals("I'm riding a wave of electricity!", electricCar.drive());
    }
}
