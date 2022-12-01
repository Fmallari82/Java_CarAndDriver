package com.francisco.caranddriver.models;

public class Driver extends Car{

	public Driver() {}
	
    public void drive(){
        System.out.println("You are driving the car");
        if(gas==0) {
        	System.out.println("You are out of gas!!");
        }else {        	
        	gas--;
        }
        status();
    }

    public void boost(){
        System.out.println("You hit the boosters!**VROOOOM**");
        if(gas < 3) {
        System.out.println("You Don't have enough gas to use booster!");
        }else {
        	gas-=3;
        }
        status();
    }

    public void refuel(){
        System.out.println("Refueling car");
        gas+=2;
        status();
    }

}
