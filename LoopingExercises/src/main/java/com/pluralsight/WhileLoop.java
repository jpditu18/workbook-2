package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException{
        //create a while loop
        int i = 5;
        while (i > 0){
            System.out.println("I love Java");
            Thread.sleep(1000);
            i--;
        }
    }
}
