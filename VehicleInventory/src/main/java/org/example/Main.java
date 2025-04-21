package org.example;

import javax.xml.crypto.Data;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehiclesArray = new ArrayList<>();
        int vehicleCount = 0;

        vehiclesArray.add(new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500));
        vehiclesArray.add(new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000));
        vehiclesArray.add(new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700));
        vehiclesArray.add(new Vehicle(101124, "Honda Civic", "White", 70000, 7500));
        vehiclesArray.add(new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500));
        vehiclesArray.add(new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000));

        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.print("What do you want to do?\n\n 1 - List all vehicles\n 2 - Search by make/model\n 3 - Search by price range" +
                    "\n 4 - Search by color\n 5 - Add a vehicle\n 6 - Quit\n\nEnter your command:");
            int menuOption = read.nextInt();

            switch (menuOption) {
                case 1:
                    DatabaseHelper.listAll(vehiclesArray);
                    break;
                case 2:
                    DatabaseHelper.searchMakeModel(vehiclesArray);
                    break;
                case 3:
                    DatabaseHelper.searchPrice(vehiclesArray);
                    break;
                case 4:
                    DatabaseHelper.searchColor(vehiclesArray);
                    break;
                case 5:
                    DatabaseHelper.addNewVehicle(vehiclesArray);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

        }
    }
}