import java.util.Scanner;
public class Banking {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean isRun = true;
        double balance = 0;
        double loan = -1000.0;
        while(isRun){
            System.out.println("==== Banking program ====");
            System.out.println("Your balance :" + balance);
            System.out.println("Your loan :" + loan);
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Exit");

            int choice = sc.nextInt();
            switch(choice){
                case 1 -> balance += deposite();
                case 2 -> balance -= withdraw();
                case 3 -> isRun = false;
                default -> System.out.println("infalid choice");
            }
        }
    }

    public static double deposite(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Put a deposite:");
        double summa = sc.nextDouble();
        return summa;
    }

    public static double withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Put amount:");
        double summa = sc.nextDouble();
        return summa;
    }
}
