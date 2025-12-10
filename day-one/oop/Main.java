package oop;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        Car car = new Car();
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        System.out.println(car.model + " $" + car.cost + " year: " + car.year);
    }
}
