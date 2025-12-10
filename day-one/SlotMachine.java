import java.util.Scanner;

public class SlotMachine {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        boolean running = true;
        double balance = 0;
        balance += sc.nextDouble();
        while(running){
            System.out.println("To run");
        }

        System.out.println("You withdaw total: $" + balance);
    }

}
