package Dealership;

import Car.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    PetrolCar petrolCar;

    @Before
    public void before() {
        customer = new Customer("Diego", 1000000);
        petrolCar = new PetrolCar("Ford", "Fiesta", 12000, "Blue", "1L Cheap as chips.");
    }

    @Test
    public void getName() {
        assertEquals("Diego", customer.getName());
    }

    @Test
    public void getWallet() {
        assertEquals(1000000, customer.getWallet(), 0.01);
    }

    @Test
    public void setWallet() {
        customer.setWallet(10);
        assertEquals(10, customer.getWallet(), 0.01);
    }

    @Test
    public void canAddCar() {
        customer.addCar(petrolCar);
        assertEquals(1, customer.getCarsSize());
    }

}
