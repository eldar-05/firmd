package b_getset;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BWM", "White", 12000);
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());

        car.setColor("Red");
        
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());

        car.setPrice(5000);

        System.out.println(car.getPrice());

        car.setPrice(8000);

        System.out.println(car.getPrice());
    }
}
