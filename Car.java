/**
 * @author      Sabrina Li <a href="mailto:sabrina.li1@ucalgary.ca">sabrina.li1@ucalgary.ca</a>
 * @version     1.0
 * @since       1.0
 */

package edu.ucalgary.oop;

// import org.junit.Test;
// import static org.junit.Assert.*;
// import edu.ucalgary.oop.*;

public class Car {
    private String model;
    private Driver driver;
    private Engine engine;

    public Car(String model, Driver driver, Engine engine) {
        this.model = model;
        this.driver = driver;
        this.engine = engine;
    }

    public Car copy(boolean deepCopy) {
        // copy constructors in other classes, use copy constructor here
        if (deepCopy) {
            Car newCar = new Car(this.model, new Driver(this.driver), new Engine(this.engine));
            return newCar;
        } else {
            // shallow copy, return the reference to this object
            return this;
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}