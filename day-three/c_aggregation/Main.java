package c_aggregation;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Manas", 12000);
        Book book2 = new Book("Semetei", 7500);
        Book book3 = new Book("Smak", 200);

        Book[] books = {book1, book2, book3};

        Librarry library = new Librarry("Ala-Too", 1950, books);

        library.displayInfo();
    }
}
