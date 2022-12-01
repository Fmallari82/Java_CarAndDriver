package com.francisco.caranddriver.models;

public class Car {
	//constructor
	public Car() {}
	//attribute
    public int gas = 10;
    
    public void status(){
        System.out.println("Gas remaining: " + gas + "/10");
    }
}
