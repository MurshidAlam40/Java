
import java.io.*;
//abstract calss
abstract class Shape{
    int color;
    int getColor(){
        return color;
    }
    Shape(int c){
        color = c;
    }
    //abstract method
    abstract double getArea();
}
class square extends Shape{
    double side;
    square(int c, double s){
        super(c);
        side = s;
    }
    double getArea(){
        return side*side;
    }
}

class Test {
	public static void main (String[] args) {
	    square s = new square(5, 10.0);
	    //Shape s = new square(6, 11.5);// refrence instance also work
		System.out.println(s.getArea());
	}
}
