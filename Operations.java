package Basics;
import java.util.*;
class Operations {
    void sum (int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    void sub (int a, int b){
        int sub = a - b;
        System.out.println(sub);
    }
    void mul(int a, int b){
        int mul = a*b;
        System.out.println(mul);
    }
    void div(int a, int b){
        int div = a/b;
        System.out.println(div);
    }
}
class Test{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter two values");
        Operations obj = new Operations();
        obj.sum(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
    }
}
