/**
 * @author      Carl Leipoldt <a href="mailto:carl.leipoldt@ucalgary.ca">carl.leipoldt@ucalgary.ca</a>
 * @version     1.0
 * @since       1.0
 */

package edu.ucalgary.oop;

public class Driver {
    private String Name;
    
    public Driver(){
    }

    public Driver(String Name){
        this.Name = Name;
    }

    public Driver(Driver originalDriver){
        this.Name = originalDriver.Name;
    }


    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
}



