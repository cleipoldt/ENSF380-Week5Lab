package edu.ucalgary.car;

public class engine {
    private String engineType;

    piblic Engine(){
    
    }

    public Engine(String engineType){
        this.engineType = engineType;
    }
    
    public Engine(Driver originalEngine){
        this.engineType = originalEngine;
    }
    
}
