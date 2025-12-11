package f_arraylst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("MERCEDES");
        cars.add("Bentley");

        System.out.println(cars);

        cars.set(0, "Fit");

        System.out.println(cars);

        System.out.println(cars.get(1));

        System.out.println(cars.size());

        Collections.sort(cars);
        Collections.sort(list);
        System.out.println(cars + " " +  list);

        for(String car : cars){
            System.out.println(car);
        }

        //############################################

        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.println("Enter number of food");

        int num = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < num; i++){
            System.out.print("Enter food #" + (i + 1) + ": ");
            foods.add(sc.nextLine());
        }

        System.out.println(foods);

        foods.remove(0);

        System.out.println("after removing the first" + foods);

        sc.close();
    }
}
