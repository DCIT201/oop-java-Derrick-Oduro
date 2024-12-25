package main.java.com.vehiclerental;

public interface Rentable {
    void rent(Customer customer, int days);

    void returnVehicle();
}

