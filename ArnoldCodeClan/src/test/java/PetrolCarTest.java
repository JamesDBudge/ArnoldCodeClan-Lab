import Car.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;

    @Before
    public void before() {
        petrolCar = new PetrolCar("Lamborghini", "Aventador", 250000, "Lime Green", "850hp");
    }

    @Test
    public void canGetMake() {
        assertEquals("Lamborghini", petrolCar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Aventador", petrolCar.getModel());
    }

    @Test
    public void canGetPrice() {
        assertEquals(250000, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void canGetColour() {
        assertEquals("Lime Green", petrolCar.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals("850hp", petrolCar.getEngine());
    }


    @Test
    public void drive() {
        assertEquals("I'm drinking dinosaur bones!", petrolCar.drive());
    }
}
