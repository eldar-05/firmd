package g_interface;

public class Fish implements Prey, Predator{
    @Override
    public void run(){
        System.out.println("Fish is swim away");
    }

    @Override
    public void hunt(){
        System.out.println("Fish eats snail");
    }
}
