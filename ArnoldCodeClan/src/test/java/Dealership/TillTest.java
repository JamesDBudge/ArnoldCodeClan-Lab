package Dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TillTest {

    Till till;

    @Before
    public void before() {
        till = new Till(50000);
    }


    @Test
    public void getMoney() {
        assertEquals(50000, till.getMoney(), 0.01);
    }

    @Test
    public void setMoney() {
        till.setMoney(25000);
        assertEquals(25000, till.getMoney(), 0.01);
    }

    @Test
    public void adjustTill() {
        till.reduceMoney(5000);
        assertEquals(45000, till.getMoney(), 0.01);
    }
}
