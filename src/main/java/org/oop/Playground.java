package org.oop;

import java.util.List;

public class Playground {
    //psvm shortcut
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(new Vehicle(), new Car(), new Plane(), new Boat());
        // iterate over the list of object and run start method on every element
        for (Vehicle v : vehicles) {
            //polymorphic call
            v.start();
            // Check the objects type and run it's unique method
            if (v instanceof Car) {
                // The below code is a shortcut for : Car car = (Car)v;
                ((Car) v).stopCar();

            } else if (v instanceof Boat) {

                ((Boat) v).stopBoat();
            } else if (v instanceof Plane) {
                ((Plane) v).stopPlan();
            }

        }
    }
}

class Vehicle {
    void start() {
        System.out.println("Vehicle has Started");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car has started");

    }

    void stopCar() {
        System.out.println("Car has stopped");

    }
}

class Boat extends Vehicle {


    @Override
    void start() {
        System.out.println("Boat has started");
    }

    void stopBoat() {
        System.out.println("Stop Boat");

    }
}

class Plane extends Vehicle {


    @Override
    void start() {
        System.out.println("Plan has started");
    }

    void stopPlan() {
        System.out.println("Stop Plan");

    }
}