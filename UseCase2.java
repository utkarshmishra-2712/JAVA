package Basics;
import static java.lang.Math.*;
public class UseCase2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        for (Shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
}
abstract class Shape{
    void displayArea(){
        System.out.println("Area = " + area());
    };
    abstract double area();
}
class Circle extends Shape{
    double radius;
    double area;
    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return this.radius*this.radius*PI;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double area(){
        return this.length*this.breadth;
    }
}