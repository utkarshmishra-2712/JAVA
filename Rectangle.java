package Basics;
import java.util.*;
public class Rectangle {
    int l,b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    void area() {
        System.out.println("Area of rectangle : " + l * b);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Rectangle obj = new Rectangle(a,b);
        obj.area();
    }
}
