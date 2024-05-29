package org.example.company;

public class Car {
    private boolean engine;

    private  int cylinders;

    private String name;

    private int wheels = 5;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object car) {
        if(car instanceof Ford){
            if(((Ford) car).getCylinders() ==cylinders && ((Ford) car).getName().equals(name)){
                return true;
            }
        }
        if(car instanceof Holden){
            if(((Holden) car).getCylinders() ==cylinders && ((Holden) car).getName().equals(name)){
                return true;
            }
        }
        if(car instanceof Mitsubishi){
            return ((Mitsubishi) car).getCylinders() == cylinders && ((Mitsubishi) car).getName().equals(name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return  "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

}
