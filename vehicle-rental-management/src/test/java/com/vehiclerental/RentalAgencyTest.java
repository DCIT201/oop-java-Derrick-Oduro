package test.java.com.vehiclerental;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RentalAgencyTest {

    private RentalAgency agency;
    private Vehicle car;

    @BeforeEach
    public void setUp() {
        agency = new RentalAgency();
        car = new Car("C123", "Honda Civic", 50.0, true);
        agency.addVehicle(car);
    }

    @Test
    public void testRentVehicle() {
        Customer customer = new Customer("John Doe");
        agency.rentVehicle("C123", customer, 3);
        assertEquals(1, customer.getCurrentRentals().size(), "Customer should have 1 rental.");
    }

    @Test
    public void testRentVehicleNotAvailable() {
        car.setAvailable(false);
        Customer customer = new Customer("John Doe");
        agency.rentVehicle("C123", customer, 3);
        assertEquals(0, customer.getCurrentRentals().size(), "Customer should not have any rentals.");
    }
}
