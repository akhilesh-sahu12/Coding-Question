package com.akhil;

public class Car2 {
    private String make;
    private String model;
    private  int year;
    Car2( String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;

    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
}
