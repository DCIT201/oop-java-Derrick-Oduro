package main.java.com.vehiclerental;


public class Car extends Vehicle {
    private boolean isElectric;

    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean isElectric) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.isElectric = isElectric;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getBaseRentalRate() * days;
        if (isElectric) {
            cost *= 1.2; // Electric surcharge
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
