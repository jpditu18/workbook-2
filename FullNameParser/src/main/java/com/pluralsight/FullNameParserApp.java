package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApp {



    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //ask user for name
        System.out.println("Enter your name (first last or first middle last): ");
        String input = myScanner.nextLine();

        //trim input
        input = input.trim();

        //split the name into parts
        String[] nameParts = input.split("\\s+");

        //handle different name formats
        if (nameParts.length == 2){
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: "+ lastName);
        } else if (nameParts.length == 3) {
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        }else {
            System.out.println("Invalid input. Please enter a name in the correct name format: first last or first middle last. ");
        }


    }













}
