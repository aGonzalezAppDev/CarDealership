package com.learntocode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {

    public DealershipFileManager(){

    }
    public ArrayList<Dealership> getDealership() throws IOException {
        ArrayList<Dealership> dealership = new ArrayList<Dealership>();
        BufferedReader reader = new BufferedReader(new FileReader("dealership.csv"));
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
                String name = parts[0];
                String address = parts[1];
                String phone = parts[2];
                dealership.add(new Dealership(name, address, phone));
                System.out.println(dealership);
                if (parts.length == 8) {
                    ArrayList<Vehicle> inventory = new ArrayList<>();
                    String.valueOf(reader.skip(41));
                    int vin = parts[0];
                    int year = parts[1];
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = parts[6];
                    double price = parts[7];
                    inventory.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                    System.out.println(inventory);
                }
            }
        return dealership;
    }

    public void saveDealership(Dealership dealership){

    }

}
