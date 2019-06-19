package Dealership;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void before() {
        dealer = new Dealer("James");
    }

    @Test
    public void canGetName() {
        assertEquals("James", dealer.getName());
    }

}
