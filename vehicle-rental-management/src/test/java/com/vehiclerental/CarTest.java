package test.java.com.vehiclerental;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.vehiclerental.Customer;

public class CarTest {

    private Car car;

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
        assertTrue(car.isAvailableForRental(), "Car should be available for rental.");
    }

    @Test
    public void testRentVehicle() {
        Customer customer = new Customer("John Doe");
        car.rent(customer, 3);
        assertEquals(3, customer.getCurrentRentals().size(), "Customer should have 3 current rentals.");
    }
}