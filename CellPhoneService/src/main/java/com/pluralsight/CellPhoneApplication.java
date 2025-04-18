package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        CellPhone myCell = new CellPhone();

        System.out.println();
        myCell.setSerialNumber(Prompter.enterLong(read,"Enter serial number: "));
        myCell.setModel(Prompter.enterInfo(read,"Specify phone model: "));
        myCell.setCarrier(Prompter.enterInfo(read,"Specify the carrier: "));
        myCell.setPhoneNumber(Prompter.enterInfo(read,"Enter phone number: "));
        myCell.setOwner(Prompter.enterInfo(read,"Enter phone owner's name: "));

        System.out.printf("%s's phone\nModel: %s\nCarrier: %s\nPhone number: %s\nSerial Number: %s",
                myCell.getOwner(),myCell.getModel(),myCell.getCarrier(),myCell.getPhoneNumber(),myCell.getSerialNumber());
    }
}
