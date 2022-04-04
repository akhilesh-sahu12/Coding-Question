package com.akhil;

public class Car {

    String make="chevrolet";
    String model="corvette";
    int year= 2020;
    String color="blue";
    /*
    double price=500000.00;
    void drive(){
        System.out.println("You drive the car");
    }
    void brake(){
        System.out.println("You step on the breakes");
       }
    */
    public  String toString(){
        String myString= make+"\n"+model+"\n"+color+"\n"+year;
        return myString;
    }

}