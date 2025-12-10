package constructor;

public class Main {
    public static void main(String args[]){
        Student st1 = new Student("Eldar", 20, 4.0);
        Student st2 = new Student("Kasym", 19, 4);

        System.out.println(st1.name);
        System.out.println(st1.age);
        System.out.println(st1.gpa);

        System.out.println(st2.name);
        System.out.println(st2.age);
        System.out.println(st2.gpa);

        st1.study();
    }
}
