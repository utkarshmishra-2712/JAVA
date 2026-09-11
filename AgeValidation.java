package Basics;
import java.util.*;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
        ageCheck(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
    static void ageCheck(int a) throws InvalidAgeException
    {
        if(a<18){
            throw new InvalidAgeException("Age is invalid");
        }
        else
            System.out.println("Eligible to vote");
    }
}
class InvalidAgeException extends Exception // Checked exception
{
    InvalidAgeException(String msg){
        super(msg);
    }
}