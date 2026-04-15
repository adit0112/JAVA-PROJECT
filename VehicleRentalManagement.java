import java.util.Scanner;

// Base Class
class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double rentPerDay;

    // Constructor
    public Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    // Method to calculate rent
    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent Per Day: " + rentPerDay);
    }
}

// Car Class
class Car extends Vehicle {

    public Car(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }
}
