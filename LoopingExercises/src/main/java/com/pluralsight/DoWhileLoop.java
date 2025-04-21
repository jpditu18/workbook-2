package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException{
        //create a DoWhile loop
        int i = 1;
        int sum = 0;

        do{
            System.out.println("I Love Java");
            sum++;
            Thread.sleep(1000);
        }while (sum < 5);




    }


}
