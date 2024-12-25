package test.java.com.vehiclerental;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RentalTransactionTest {

    private RentalTransaction transaction;
    private Vehicle car;
    private Customer customer;

    @BeforeEach
    public void setUp() {
        car = new Car("C123", "Honda Civic", 50.0, true);
        customer = new Customer("John Doe");
        transaction = new RentalTransaction(car, 150.0);
    }

    @Test
    public void testGetVehicle() {
        assertEquals(car, transaction.getVehicle(), "The vehicle in the transaction should be the same.");
    }

    @Test
    public void testGetAmount() {
        assertEquals(150.0, transaction.getAmount(), "The rental amount should be 150.");
    }
}
