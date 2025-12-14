package d_generics;

public class Main {
    public static void main(String[] args) {

        Box<String> box = new Box<String>();

        box.setItem("banana");

        System.out.println(box.getItem());

        Box<Integer> box2 = new Box<>();

        box2.setItem(32);
        System.out.println(box2.getItem());

        Product<String, Double> product = new Product<>("apple", 0.50);
        System.out.println(product.getItem() + " price: $" + product.getPrice());

        Product<String, Integer> product2 = new Product<>("Ticket", 20);
        System.out.println(product2.getItem() + " price: €" + product2.getPrice());
    }
}
