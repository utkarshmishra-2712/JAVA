package Basics;

public class Abstraction {
    public static void main(String[] args){
        Payment obj = new UPI();
        Payment.display();
        obj.makepayment();
        Payment obj1 = new Creditcard();
        obj1.makepayment();
    }
}
interface Payment{
    int a=10;  //Public Static and final
    void makepayment();
    static void display(){System.out.println("Payment successful");}
}

class UPI implements Payment{
    @Override
    public void makepayment(){
        System.out.println("Payment using UPI");
    }
}
class Creditcard implements Payment{
    @Override
    public void makepayment(){
        System.out.println("Payment using credit card");
    }
}