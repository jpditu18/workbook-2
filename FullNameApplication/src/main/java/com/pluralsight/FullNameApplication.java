package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //ask the user for their name
        //ask user for their first name
        System.out.println("Please enter your first name: ");
        String firstName = myScanner.nextLine().trim();

        //ask the user for their middle name
        System.out.println("Please enter your middle name (press Enter if none): ");
        String middleName = myScanner.nextLine().trim();

        //ask the user for their last name
        System.out.println("Please enter your last name: ");
        String lastName = myScanner.nextLine().trim();

        //ask the user for their suffix
        System.out.println("Please enter your suffix (press Enter if none): ");
        String suffix = myScanner.nextLine().trim();

        //build the full name
        StringBuilder fullName = new StringBuilder();
        fullName.append(firstName);

        if (!middleName.isEmpty()){
            fullName.append(" ").append(middleName);
        }
        fullName.append(" ").append(lastName);

        if (!suffix.isEmpty()){
            fullName.append(" , ").append(suffix);
        }

        //Display the full name
        System.out.println("Your full name is: " + fullName.toString());

    }


}
