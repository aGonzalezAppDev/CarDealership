package com.learntocode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {
    private final ArrayList<Dealership> dealership = new ArrayList<Dealership>();

    // fix for vehicle parts
    public ArrayList<Dealership> getDealership() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dealership.csv"));
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\|");
            if (parts.length == 3) {
                String name = parts[0];
                String address = parts[1];
                String phone = parts[2];
                dealership.add(new Dealership(name, address, phone));
            }
        }
        return dealership;
    }

    public static void saveDealership(Dealership dealership){

    }

}
