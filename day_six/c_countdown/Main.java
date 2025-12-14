package c_countdown;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many seconds you want? ");
        int num = sc.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            int count = num;

            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println("happy new year");
                    timer.cancel();
                }
            }
        };
        
        timer.scheduleAtFixedRate(task, 0,1000);
    }
}
