package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper {

    public static Scanner read = new Scanner(System.in);

    public static void listAll(List<Vehicle> vehicles){
        for (int i = 0; i < vehicles.size(); i++){
            vehicles.get(i).showDetails();
        }
    }

    public static void searchMakeModel(List<Vehicle> vehicles){

        System.out.print("\nSelect Make/Model to search for: ");

        String term = read.nextLine();
        List<Vehicle> found = new ArrayList<>();
        for(Vehicle v : vehicles){
            if (v.getMakeModel().equals(term)){
                found.add(v);
            }
        }

        if(!found.isEmpty()){
            for(Vehicle v : found){
                v.showDetails();
            }
        }else{
            System.out.println("No match found.");
        }
    }

    public static void searchPrice(List<Vehicle> vehicles){

        System.out.print("\nSelect minimum price: ");

        float min = read.nextFloat();

        System.out.print("\nSelect max price: ");

        float max = read.nextFloat();

        List<Vehicle> found = new ArrayList<>();
        for(Vehicle v : vehicles){
            float _price = v.getPrice();
            if (_price >= min && _price <= max){
                found.add(v);
            }
        }

        if(!found.isEmpty()){
            for(Vehicle v : found){
                v.showDetails();
            }
        }else{
            System.out.println("No match found.");
        }
    }

    public static void searchColor(List<Vehicle> vehicles){

        System.out.print("\nSelect Color to search for: ");

        String term = read.nextLine();
        List<Vehicle> found = new ArrayList<>();
        for(Vehicle v : vehicles){
            if (v.getMakeModel().equals(term)){
                found.add(v);
            }
        }

        if(!found.isEmpty()){
            for(Vehicle v : found){
                v.showDetails();
            }
        }else{
            System.out.println("No match found.");
        }
    }


    public static void addNewVehicle(List<Vehicle> vehicles){

        Vehicle toAdd = new Vehicle();

        System.out.print("Enter vehicle ID: ");
        toAdd.setVehicleId(read.nextLong());
        System.out.print("Enter Make/Model: ");
        toAdd.setMakeModel(read.nextLine());
        System.out.print("Enter vehicle color: ");
        toAdd.setColor(read.nextLine());
        System.out.print("Enter odometer reading: ");
        toAdd.setOdometerReading(read.nextInt());
        System.out.print("Enter price: ");
        toAdd.setPrice(read.nextFloat());

        vehicles.add(toAdd);
    }
}
