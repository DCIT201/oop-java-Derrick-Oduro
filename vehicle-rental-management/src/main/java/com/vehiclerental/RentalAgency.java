package main.java.com.vehiclerental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.rent(customer, days);
                return;
            }
        }
        System.out.println("Vehicle not available for rent.");
    }

    public void returnVehicle(String vehicleId) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                vehicle.returnVehicle();
                return;
            }
        }
        System.out.println("Vehicle with ID " + vehicleId + " not found.");
    }
}


