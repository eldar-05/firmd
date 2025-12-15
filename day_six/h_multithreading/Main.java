package h_multithreading;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("Eldar"));
        Thread thread2 = new Thread(new MyRunnable("Kasym"));

        System.out.println("Game start");

        thread1.start();
        thread2.start();
        
        try{
            thread1.join();
            thread2.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted! ");
        }

        System.out.println("Game over");

    }
}
