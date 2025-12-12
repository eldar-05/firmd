import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        boolean running = true;
        while(running){
            System.out.println("In this data base: " + persons.size() + " persons");
            System.out.println("1. Add person");
            System.out.println("2. View info by ID");
            System.out.println("3.");
            int choose = sc.nextInt();
            sc.nextLine();

            if(choose == 1){
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Surname: ");
                String surname = sc.nextLine();

                System.out.print("age:");
                int age = sc.nextInt();
                persons.add(new Person(name, surname, age));
            } else if(choose == 2){
                System.out.println("ID: ");
                int id = sc.nextInt() + 1;
                if(id < persons.size() - 1 || id < 0){
                    System.out.println("There is no such id");
                }
                System.out.println("There is info about this person:");
                (persons.get(id - 1)).getInfo();
            } else {
                System.out.println("Chose valid variant");
            }

        }
        System.out.println(persons);
    }
}
