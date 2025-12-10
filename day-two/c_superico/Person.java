package c_superico;

public class Person {
    String name;
    String surname;

    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    void showName(){
        System.out.println(name + " " + surname);
    }
}
