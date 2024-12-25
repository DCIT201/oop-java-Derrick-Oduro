package main.java.com.vehiclerental;


public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasSideCar) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (hasSideCar) {
            cost += 10; // Additional sidecar cost
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}



