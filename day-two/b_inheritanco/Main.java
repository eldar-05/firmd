package b_inheritanco;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();
        System.out.println(dog.isAlive);
        dog.eat();
        System.out.println(cat.isAlive);
        cat.sound();

        System.out.println(cat.isAlive);

        System.out.println(plant.isAlive);
        plant.photosintesis();

    }
}
