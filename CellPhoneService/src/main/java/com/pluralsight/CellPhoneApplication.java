package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone();

        System.out.println("What is the serial number?");
        String sn = theScanner.nextLine();

        System.out.println("What model is the phone?");
        String model = theScanner.nextLine();

        System.out.println("Who is the carrier?");
        String carrier = theScanner.nextLine();

        System.out.println("What is the phone number?");
        String phoneNumber = theScanner.nextLine();

        System.out.println("Who is the owner of the phone?");
        String owner = theScanner.nextLine();

        //set the cellphone data on the object
        myPhone.setSerialNumber(Integer.parseInt(sn));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        //use the getters to display this information
     //   System.out.println("SN: " + myPhone.getSerialNumber());
     //   System.out.println("Model: " + myPhone.getModel());
     //   System.out.println("Carrier: " + myPhone.getCarrier());
     //   System.out.println("Phone Number: " + myPhone.getPhoneNumber());
     //   System.out.println("Owner: " + myPhone.getOwner());

        CellPhone burnerPhone = new CellPhone();
        burnerPhone.setPhoneNumber("817-353-2453");
        burnerPhone.setOwner("Uncle Ruckus");

        System.out.println("---------info for myPhone--------");
        //Display my phone
        display(myPhone);

        System.out.println("-----------info for burnerPhone-------");
        //Display burner phone instead
        display(burnerPhone);

        //my phone call the burner phone
        myPhone.dial(burnerPhone.getPhoneNumber());

        //have burner call the phone
        burnerPhone.dial(myPhone.getPhoneNumber());



    }

    static void display(CellPhone phone){
        System.out.println("SN: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
