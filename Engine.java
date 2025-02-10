/**
 * @author      Parvathi Madhu <a href="mailto:parvathi.madhu@ucalgary.ca">parvathi.madhu@ucalgary.ca</a>
 * @version     1.0
 * @since       1.0
 */

package edu.ucalgary.oop;

public class Engine {
    private String engineType;

    public Engine(String engineType){
        this.engineType = engineType;
    }
    
    public Engine(Engine other){
        this.engineType = other.getEngineType();
    }

    public String getEngineType(){
        return this.engineType;
    }

    public void setEngineType(String engineType){
        this.engineType = engineType;
    }
    
}
