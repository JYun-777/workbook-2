package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone cellPhone3 = new CellPhone(12345,"Samsung Active","AT&T", "Jonathan", "510-234-0958");

        cellPhone2.setPhoneNumber("555-555-5555");



        System.out.println();
        cellPhone1.setSerialNumber(Prompter.enterLong(read,"Enter serial number: "));
        cellPhone1.setModel(Prompter.enterInfo(read,"Specify phone model: "));
        cellPhone1.setCarrier(Prompter.enterInfo(read,"Specify the carrier: "));
        cellPhone1.setPhoneNumber(Prompter.enterInfo(read,"Enter phone number: "));
        cellPhone1.setOwner(Prompter.enterInfo(read,"Enter phone owner's name: "));

        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone3.dial(cellPhone2.getPhoneNumber());
    }

    public static void display(CellPhone phone){
        System.out.printf("%s's phone\nModel: %s\nCarrier: %s\nPhone number: %s\nSerial Number: %s\n\n",
                phone.getOwner(),phone.getModel(),phone.getCarrier(),phone.getPhoneNumber(),phone.getSerialNumber());

    }
}
