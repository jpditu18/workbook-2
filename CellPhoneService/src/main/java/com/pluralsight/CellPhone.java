package com.pluralsight;

public class CellPhone {

    //these are the properties/variations that describe a cellphone
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //this is the constructor
    //in this case it's decided the values for the properties
    public CellPhone(){
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    //Overload Constructor
    public CellPhone(int serialNumber,String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
    //method to make a phone dial a phone number
    public void dial(String phoneNumber){

        System.out.println(this.getOwner() + "'s phone is calling " + phoneNumber);
    }

    public void display(){
        System.out.println("Cell Phone Details:");
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Model: " + model);
        System.out.println("Carrier: " + carrier);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Owner: " + owner);

    }

    //getter and setters are below this comment
    public int getSerialNumber() {

        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {

        this.serialNumber = serialNumber;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getCarrier() {

        return carrier;
    }

    public void setCarrier(String carrier) {

        this.carrier = carrier;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {

        return owner;
    }

    public void setOwner(String owner) {

        this.owner = owner;
    }
}
