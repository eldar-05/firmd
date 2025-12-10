package c_superico;

public class Main {
    public static void main(String[] args) {
        Person eldar = new Person("Eldar", "Zhar");
        eldar.showName();
        Student student = new Student("Kasym", "Gairatbekov", 4);
        student.showName();
        student.showGpa();

        Employe employe = new Employe("Bektur", "Bekov", 2400);
        System.out.println("=========================");
        employe.tellAbout();
        student.tellAbout();
    }
}
