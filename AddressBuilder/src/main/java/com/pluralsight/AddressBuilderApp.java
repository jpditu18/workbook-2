package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {

    public static void main(String[] args) {

        Scanner address = new Scanner(System.in);

        //ask user for the full name
        System.out.println("What is your full name?: ");
        String fullName = address.nextLine();
        String[] nameParts = fullName.trim().split(" ");
        String formattedName;

        if (nameParts.length >= 2){
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length -1];
            formattedName = lastName + ", " + firstName;
        } else {
            formattedName = fullName;
        }

        //ask user for the street name
        System.out.println("Street: ");
        String streetName = address.nextLine();

        //ask user for the city name
        System.out.println("City: ");
        String cityName = address.nextLine();

        //ask user for the state name
        System.out.println("State:");
        String

        //ask user for the zipcode
        System.out.println("");



        //ask the user for the shipping street name
        //ask the user for the shipping city name
        //ask the user for the shipping state name
        //ask the user for the shipping zipcode


    }






}
