package edu.ucalgary.oop;

public class Driver {
    private String driverName;
    
    public Driver(){
    }

    public Driver(String driverName){
        this.driverName = driverName;
    }

    public Driver(Driver originalDriver){
        this.driverName = originalDriver.driverName;
    }
}



