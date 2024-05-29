package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;
    private GasPoweredCar gasPoweredCar ;
    private ElectricCar electricCar;
    private HybridCar hybridCar;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine(){

    }
    public void drive(){
        runEngine();
    }
    protected void runEngine(){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
