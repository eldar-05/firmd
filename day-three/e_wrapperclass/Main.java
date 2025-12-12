package e_wrapperclass;

public class Main {
    public static void main(String[] args) {

        //##########################################

        Integer a1 = 123;
        Double b1 = 3.14;
        Character c1 = '$';
        Boolean d1 = true;
        String e1 = "pizza";
        System.out.println(a1 + " " + b1 + " " + c1 +  " " + d1 + " " + e1);

        //######################################

        String a2 = Integer.toString(123);
        String b2 = Double.toString(3.14);
        String c2 = Character.toString('@');
        String d2 = Boolean.toString(false);

        String str = a2 + b2 + c2 + d2;
        System.out.println(str);

        //##########################################

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        System.out.println(a + " " + b +  " " + c + " " + d);

        //###########################################

        char letter = 'a';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

        //###########################################

        

    }
}
