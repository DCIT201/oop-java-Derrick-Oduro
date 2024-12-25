package main.java.com.vehiclerental;


public abstract class Vehicle implements Rentable {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // Constructor with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        if (vehicleId == null || vehicleId.isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty");
        }
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    // Getters and setters with validation
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty");
        }
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate <= 0) {
            throw new IllegalArgumentException("Base rental rate must be greater than 0");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Abstract methods for subclasses
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    // Implement Rentable methods
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            this.isAvailable = false;
            double rentalCost = calculateRentalCost(days);
            customer.addRental(this, rentalCost);
            System.out.println("Vehicle rented: " + getVehicleId() + " for " + days + " days. Total cost: " + rentalCost);
        } else {
            System.out.println("Vehicle is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        this.isAvailable = true;
        System.out.println("Vehicle " + getVehicleId() + " has been returned.");
    }

    // Override toString(), equals(), and hashCode()
    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Model: " + model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return vehicleId.equals(vehicle.vehicleId);
    }

    @Override
    public int hashCode() {
        return vehicleId.hashCode();
    }
}
