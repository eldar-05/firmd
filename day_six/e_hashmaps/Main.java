package e_hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Person> map = new HashMap();
        

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running){
            try{
                System.out.print("Name :");
                String name = sc.nextLine();
                if(name.equals("00")){
                    running = false;
                    break;
                }
                System.out.print("Surname :");
                String surname = sc.nextLine();
                System.out.print("Money :");
                int money = sc.nextInt();
                sc.nextLine();
                Person person = new Person(name, surname, money);
                map.put(name, person);
            } catch (Exception e){
                System.out.println("Reason of error " + e);
            }
        }
        System.out.println(map);
        
        /*
        map.put("banana", 0.15);
        map.put("orange", 0.20);
        map.put("apple", 0.25);
        map.put("papaya", 2.00);



        System.out.println(map);

        if(map.containsKey("apple")){
            System.out.println(map.get("apple"));
        } else {
            System.out.println("there is no such product! d");
        }

        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key) + " BTC");
        }

        */


    }
}
