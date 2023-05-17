package com.learntocode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
        inventory = new ArrayList<>();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }


    // method for getting vehicle by price range
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minimum price: ");
        double minPrice = input.nextDouble();
        System.out.print("Enter maximum price: ");
        double maxPrice = input.nextDouble();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                System.out.println(vehicle);
            }
        }
        return inventory;
    }

    // method for getting vehicle by model
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter make: ");
        String userMake = input.nextLine();
        System.out.print("Enter model: ");
        String userModel = input.nextLine();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(userMake) && vehicle.getModel().equalsIgnoreCase(userModel)) {
                System.out.println(vehicle);
            }
        }
        return inventory;
    }

    // method for getting vehicle by year
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minimum year: ");
        int minYear = input.nextInt();
        System.out.print("Enter maximum year: ");
        int maxYear = input.nextInt();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= minYear && vehicle.getYear() <= maxYear) {
                System.out.println(vehicle);
            }
        }
        return inventory;
    }

    // method for getting vehicle by color
    public ArrayList<Vehicle> getVehiclesByColor(String color){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter color: ");
        String vehicleColor = input.nextLine();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(vehicleColor)) {
                System.out.println(vehicle);
            }
        }
        return inventory;
    }

    // method for getting vehicle by mileage
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minimum mileage: ");
        int minMileage = input.nextInt();
        System.out.print("Enter maximum mileage: ");
        int maxMileage = input.nextInt();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() >= minMileage && vehicle.getOdometer() <= maxMileage) {
                System.out.println(vehicle);
            }
        }
        return inventory;
    }

    // method for getting vehicle by type
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter vehicle type: ");
        String inputVehicleType = input.nextLine();

        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(inputVehicleType)) {
                System.out.println(vehicle);
            }
        }
        return inventory;
    }

    // method for getting all vehicles - all inventory
    public ArrayList<Vehicle> getAllVehicles(){
        for (Vehicle vehicle : inventory){
            System.out.println(vehicle);
        }
        return inventory;
    }

    // method for adding a vehicle
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    // method for removing a vehicle
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }

    // To string

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
