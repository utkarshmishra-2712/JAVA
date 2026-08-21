package Basics;

public class Hello {
    static void main(String[] args) {
        System.out.println("Hello World");
        Test s1 = new Test();
        s1.func();
    }
}

class Test{
        void func(){
        System.out.println("Hello World");
    }
}