/*
 * Inheritance and Polymorphism Refresher
 */
package com.jordan.javapractice;
// Base Class (Superclass)
class Vehicle {
    String name;
    int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println(name + " is moving at speed " + speed);
    }
}

// Subclass (Inheritance)
class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " (Car) is driving at speed " + speed);
    }
}

// Subclass (Inheritance)
class Bike extends Vehicle {
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " (Bike) is cycling at speed " + speed);
    }
}

// Polymorphism Example
public class InPol {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Tesla", 120);
        Vehicle myBike = new Bike("Mountain Bike", 15);

        myCar.move(); // Tesla (Car) is driving at speed 120
        myBike.move(); // Mountain Bike (Bike) is cycling at speed 15
    }
}