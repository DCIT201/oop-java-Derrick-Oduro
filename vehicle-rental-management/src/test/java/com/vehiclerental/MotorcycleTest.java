package test.java.com.vehiclerental;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MotorcycleTest {

    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        motorcycle = new Motorcycle("M123", "Yamaha R1", 40.0, true, true);
    }

    @Test
    public void testCalculateRentalCost() {
        assertEquals(120.0, motorcycle.calculateRentalCost(3), "Rental cost should be 120 for 3 days.");
    }

    @Test
    public void testIsAvailableForRental() {
        assertTrue(motorcycle.isAvailableForRental(), "Motorcycle should be available for rental.");
    }

    @Test
    public void testHasSideCar() {
        assertTrue(motorcycle.hasSideCar(), "Motorcycle should have a sidecar.");
    }
}
