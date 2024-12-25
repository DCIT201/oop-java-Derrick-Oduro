package main.java.com.vehiclerental;


public class RentalTransaction {
    private Vehicle vehicle;
    private double totalCost;

    // Constructor to initialize the transaction with a vehicle and cost
    public RentalTransaction(Vehicle vehicle, double totalCost) {
        this.vehicle = vehicle;
        this.totalCost = totalCost;
    }

    // Getters and Setters
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Rental Transaction: " + vehicle.toString() + ", Total Cost: " + totalCost;
    }
}
