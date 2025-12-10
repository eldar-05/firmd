package arrayOfObject;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("M5", "Red"),
                     new Car("Monster", "Violet"),
                     new Car("Audi", "White")};

        for(Car car : cars){
            car.drive();
        }
    }
}
