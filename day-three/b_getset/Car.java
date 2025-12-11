package b_getset;

public class Car {
    final private String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    int getPrice(){
        return this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if(price < 7000){
            System.out.println("Price cant be less than 7000");
        } else {
            
        this.price = price;
        }
    }
}
