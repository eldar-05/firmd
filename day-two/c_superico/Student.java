package c_superico;

public class Student extends Person{
    double gpa;

    Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(name + " gpa: " + gpa);
    }

    void tellAbout(){
        System.out.println("This person's name is: " + name + " " + surname);
        System.out.println("He is student. He's gpa is " + gpa);
    }
}
