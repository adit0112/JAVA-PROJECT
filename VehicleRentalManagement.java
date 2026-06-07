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
    // Method Overloading 
    @Override
    public double calculateRent(int days) {
        return rentPerDay * days;
    }
}


// Bike Class
class Bike extends Vehicle {

    public Bike(String vehicleNumber, String brand, double rentPerDay) {
        super(vehicleNumber, brand, rentPerDay);
    }

    // Method Overriding
    @Override
    public double calculateRent(int days) {
        return rentPerDay * days * 0.9; // lower pricing
    }
}

// Main Class
public class VehicleRentalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== VEHICLE RENTAL SYSTEM =====");

        System.out.print("Enter Vehicle Type (car/bike): ");
        String type = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Rent per Day: ");
        double rent = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        Vehicle v;

        // Polymorphism
        if (type.equalsIgnoreCase("car")) {
            v = new Car(number, brand, rent);
        } else {
            v = new Bike(number, brand, rent);
        }

        System.out.println("\n===== VEHICLE DETAILS =====");
        v.displayDetails();

        double total = v.calculateRent(days);
        System.out.println("Total Rent: " + total);  
    }
}