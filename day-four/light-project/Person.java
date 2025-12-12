public class Person {
    static int count;
    private int ID = 1;
    private String name;
    private String surname;
    private int age;

    Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        ID = count;
        count++;
    }

    String getName(){
        return name;
    }

    String getSurname(){
        return surname;
    }

    int getAge(){
        return age;
    }

    void getInfo(){
        System.out.println("ID: " + ID + " "+ name + " " + surname + " (age:" + age + ")");
    }
}
