package com.learntocode;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private final ArrayList<Dealership> dealership;


    public UserInterface(){
        dealership = new ArrayList<>();
    }

    public void display(){
        Scanner myScanner = new Scanner(System.in);
        int command = 0;

        while(command!= 0){
            System.out.println("---------------------------");
            System.out.println("Car Dealership Menu");
            System.out.println("---------------------------");
            System.out.println();
            System.out.println("1) Search by Price");
            System.out.println("2) Search by Make/Model");
            System.out.println("3) Search by Year");
            System.out.println("4) Search by Color");
            System.out.println("5) Search by Mileage");
            System.out.println("6) Search by Vehicle Type");
            System.out.println("7) View All Vehicles");
            System.out.println("8) Add a Vehicle ");
            System.out.println("9) Remove a Vehicle ");
            System.out.println("---------------------------");
            System.out.println();
            System.out.println("Enter command: ");

            command = myScanner.nextInt();

            switch(command){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequestRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    public void processGetByPriceRequest(){

    }

    public void processGetMakeModelRequest(){

    }

    public void processGetByYearRequest(){

    }

    public void processGetByColorRequest(){

    }

    public void processGetByMileageRequest(){

    }

    public void processGetByVehicleTypeRequestRequest(){

    }

    public void processGetAllVehiclesRequest(){

    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }



}
