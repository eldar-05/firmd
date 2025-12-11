package f_abstactionio;

public class Rectangle extends Shape{
    double high;
    double width;

    Rectangle(double high, double width){
        this.high = high;
        this.width = width;
    }

    @Override
    double area(){
        return high * width;
    }
}
