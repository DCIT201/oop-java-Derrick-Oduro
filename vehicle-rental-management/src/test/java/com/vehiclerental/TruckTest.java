package test.java.com.vehiclerental;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TruckTest {

    private Truck truck;

    @BeforeEach
    public void setUp() {
        truck = new Truck("T123", "Ford F150", 100.0, true, 5000);
    }

    @Test
    public void testCalculateRentalCost() {
        assertEquals(300.0, truck.calculateRentalCost(3), "Rental cost should be 300 for 3 days.");
    }

    @Test
    public void testIsAvailableForRental() {
        assertTrue(truck.isAvailableForRental(), "Truck should be available for rental.");
    }

    @Test
    public void testLoadCapacity() {
        assertEquals(5000, truck.getLoadCapacity(), "Truck load capacity should be 5000.");
    }
}
