package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationApp {

    public static void main(String[] args) {

        Scanner ticketing = new Scanner(System.in);

        //prompt the user for their full name
        System.out.println("What is your full name?: ");
        String fullName = ticketing.nextLine();
        String[] nameParts = fullName.trim().split(" ");
        String formattedName;

        if (nameParts.length >= 2){
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length -1];
            formattedName = lastName + ", " + firstName;
        } else {
            formattedName = fullName;
        }

        //prompt the user for the date of the show
        System.out.println("What date is the show on? (MM/DD/YYYY): ");
        String date = ticketing.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(date, formatter);

        //prompt the user for the number of tickets they will need
        System.out.println("How many tickets will you need?: ");
        int ticketAmount = ticketing.nextInt();
        String plural = ticketAmount == 1 ? "" : "s";

        //Display the full output
        System.out.println(ticketAmount + " ticket" + plural +" reserved for " + showDate + " under " + fullName);

    }












}
