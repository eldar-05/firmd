package oop;

public class Car {
    String name = "BMW";
    String model = "M5";
    int year = 2025;
    double cost = 10000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = true;
        System.out.println("You stop the engine");
    }


} 
