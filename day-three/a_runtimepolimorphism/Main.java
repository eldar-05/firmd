package a_runtimepolimorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your animal is dog or cat (1 = dog, 2 = cat)");
        int choice = sc.nextInt();
        if(choice == 1){
            animal = new Dog();
            animal.voice();
        } else if (choice == 2){
            animal = new Cat();
            animal.voice();
        } else {
            System.out.println("Chose 1 or 2");
        }
    }
}
