package c_aggregation;

public class Librarry {
    String name;
    int year;
    Book[] books;

    Librarry(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The "+ name + " " + year);
        System.out.println("Books available:");
        for(Book book : books){
            System.out.println(book.displayInfo());
        }
    }
}
