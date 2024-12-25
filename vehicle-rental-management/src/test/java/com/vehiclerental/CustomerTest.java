package test.java.com.vehiclerental;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John Doe");
    }

    @Test
    public void testAddRental() {
        Vehicle car = new Car("C123", "Honda Civic", 50.0, true);
        customer.addRental(car);
        assertEquals(1, customer.getCurrentRentals().size(), "Customer should have 1 rental.");
    }

    @Test
    public void testRentalHistory() {
        Vehicle car = new Car("C123", "Honda Civic", 50.0, true);
        customer.addRental(car);
        assertEquals(1, customer.getRentalHistory().size(), "Customer should have 1 rental history.");
    }
}
