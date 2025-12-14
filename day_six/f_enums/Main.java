package f_enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day of week: ");
        String responce = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(responce);

            System.out.println(day);
            System.out.println(day.getDayNumber());

            switch (day) {
                case MONDAY,
                    TUESDAY,
                    WEDNESDAY,
                    THURSDAY,
                    FRIDAY -> System.out.println("Weekday");

                case SATURDAY ,
                    SUNDAY -> System.out.println("Weekend");
                    
                case PIZZADAY -> System.out.println("Super day!");
            }
        } catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day!");
        }
    }
}
