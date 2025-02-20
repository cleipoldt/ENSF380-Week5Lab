/**
 * @author      Carl Leipoldt <a href="mailto:carl.leipoldt@ucalgary.ca">carl.leipoldt@ucalgary.ca</a>
 * @version     1.0
 * @since       1.0
 */

package edu.ucalgary.oop;

public class Driver {
    private String name;
    
    public Driver(String name){
        this.name = name;
    }

    public Driver(Driver other){
        this.name = other.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}



