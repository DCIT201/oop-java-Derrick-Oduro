package test.java.com.vehiclerental;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    private Vehicle car;

    @BeforeEach
    public void setUp() {
        car = new Car("C123", "Honda Civic", 50.0, true);
    }

    @Test
    public void testCalculateRentalCost() {
        assertEquals(150.0, car.calculateRentalCost(3), "Rental cost should be 150 for 3 days.");
    }

    @Test
    public void testIsAvailableForRental() {
        assertTrue(car.isAvailableForRental(), "Vehicle should be available for rental.");
    }

    @Test
    public void testSetModel() {
        car.setModel("Toyota Corolla");
        assertEquals("Toyota Corolla", car.getModel(), "Model should be updated.");
    }

    @Test
    public void testSetBaseRentalRate() {
        car.setBaseRentalRate(75.0);
        assertEquals(75.0, car.getBaseRentalRate(), "Base rental rate should be updated.");
    }
}