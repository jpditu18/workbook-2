package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {

    public static void main(String[] args) {

        Scanner address = new Scanner(System.in);

        StringBuilder billingAddress = new StringBuilder();
        StringBuilder shippingAddress = new StringBuilder();

        //ask user for billing info
        System.out.println("Billing Address:");
        System.out.println("Name: ");
        billingAddress.append(address.nextLine()).append("\n");

        System.out.println("Street: ");
        billingAddress.append(address.nextLine()).append("\n");

        System.out.println("City: ");
        String city = address.nextLine();

        System.out.println("State:");
        String state = address.nextLine();

        System.out.println("Zipcode: ");
        String zip = address.nextLine();

        billingAddress.append(city).append(", ").append(state).append(" ").append(zip).append("\n");

        //ask the user for shipping info
        System.out.println("Shipping Address:");
        System.out.println("Name: ");
        shippingAddress.append(address.nextLine()).append("\n");

        System.out.println("Street: ");
        shippingAddress.append(address.nextLine()).append("\n");

        System.out.println("City: ");
        city = address.nextLine();

        System.out.println("State");
        state = address.nextLine();

        System.out.println("Zipcode: ");
        zip = address.nextLine();

        shippingAddress.append(city).append(", ").append(state).append(" ").append(zip).append("\n");


        //Display the fully formatted addresses
        System.out.println("     Billing Address\n");
        System.out.println(billingAddress.toString());
        System.out.println("============================\n");
        System.out.println("     Shipping Address\n");
        System.out.println(shippingAddress.toString());

    }






}
