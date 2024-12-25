package main.java.com.vehiclerental;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String customerId;
    private List<RentalTransaction> rentalHistory;

    // Constructor
    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.rentalHistory = new ArrayList<>();
    }

    // Add a rental transaction to the customer's rental history
    public void addRental(Vehicle vehicle, double rentalCost) {
        // Create a new RentalTransaction with the vehicle and rental cost
        RentalTransaction transaction = new RentalTransaction(vehicle, rentalCost);

        // Add the transaction to the rental history list
        rentalHistory.add(transaction);
    }

    // Getter for rental history
    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for customerId
    public String getCustomerId() {
        return customerId;
    }
}
