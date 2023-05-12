package com.learntocode;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }

    // method for getting vehicle by model
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }

    // method for getting vehicle by year
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }

    // method for getting vehicle by color
    public ArrayList<Vehicle> getVehiclesByColor(String color){
        return null;
    }

    // method for getting vehicle by mileage
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        return null;
    }

    // method for getting vehicle by type
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        return null;
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
    public void removeVehicle(ArrayList<Vehicle> vehicles){

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
