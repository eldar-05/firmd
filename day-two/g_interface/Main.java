package g_interface;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();
        Wolf wolf = new Wolf();
        rabbit.run();
        fish.run();
        fish.hunt();
        wolf.hunt();
    }
}
