package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        StringBuilder addressString = new StringBuilder();

        Scanner read = new Scanner(System.in);
        System.out.println("Please enter the following information: ");

        String[] infoList = {"Full name: ", "Billing Street: ", "Billing City: ", "Billing State: ", "Billing Zip: ",
        "Shipping Street: ", "Shipping City: ", "Shipping State: ", "Shipping Zip: "};
        for (int i = 0; i < infoList.length; i++){

            if (i == 1) addressString.append("\nBilling Address: \n");
            if (i == 5) addressString.append("\nShipping Address: \n");
            StringBuildHelper.append(read,infoList[i], addressString);
            if (i == 0 || i == 1 || i == 4 || i == 5 || i == 8) addressString.append("\n");
            else if (i == 2 || i == 6) addressString.append(", ");
            else addressString.append(" ");
        }
        System.out.println();
        String fullAddress = addressString.toString();
        System.out.println(fullAddress);
    }
}