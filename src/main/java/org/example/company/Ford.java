package org.example.company;

public class Ford extends Car{


    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return getName() + "the car is braking";
    }

    @Override
    public String accelerate() {
        return getName() + "the car is accelerating";
    }

    @Override
    public String startEngine() {
        return  getName() +"the car's engine is starting";
    }
}
