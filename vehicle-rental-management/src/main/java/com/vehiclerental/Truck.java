package main.java.com.vehiclerental;


public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable, double loadCapacity) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (loadCapacity > 1000) {
            cost += 50; // Additional cost for heavy-duty trucks
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
