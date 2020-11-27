package org.oop.abstractclass;

public class Playground {

    public static void main(String[] args) {
        //a polymorphic behavior - create an array of vehicle and run call start method
        Vehicle[] vehicles = new Vehicle[] {new Car(),new Boat(),new Car(),new Boat()};
        for (Vehicle vehicle : vehicles) {
            vehicle.start();

        }



    }
}
