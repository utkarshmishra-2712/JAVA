package Basics;

public class Hello {
    static void main(String[] args) {
        System.out.println("Hello World");
        Test1 s1 = new Test1();
        s1.func();
    }
}

class Test1{
        void func(){
        System.out.println("Hello World");
    }
}