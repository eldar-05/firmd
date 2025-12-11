package f_abstactionio;

public class Triangle extends Shape{
    double high;
    double width;

    Triangle(double high, double width){
        this.high = high;
        this.width = width;
    }

    @Override
    double area(){
        return ((high * width) / 2);
    }
}
