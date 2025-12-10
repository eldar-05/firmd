package c_superico;

public class Employe extends Person{
    int salary;

    Employe(String name, String surname, int salary){
        super(name, surname);
        this.salary = salary;
    }

    void tellAbout(){
        System.out.println("This person's name is: " + name + " " + surname);
        System.out.println("He is employe. He's salary is " + salary);
    }
}
