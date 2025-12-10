package a_statico;

public class Main {
    public static void main(String[] args) {
        Friend fr1 = new Friend("Eldar");
        System.out.println(fr1.name + " ");
        Friend.show();
        Friend fr2 = new Friend("kasym");
        Friend fr3 = new Friend("asan");

        Friend.show();
        System.out.println(fr2.name);
        System.out.println(fr3.name);
    }
}
