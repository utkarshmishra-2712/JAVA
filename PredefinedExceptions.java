package Basics;
// Exceptions are handled using 5 keywords-try, catch, finally, throw, throws...
import java.util.*;
public class PredefinedExceptions {
    public static void main(String[] args) {
        try{
        int[] arr = {1,2,3,4};
        int i,b;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        b = sc.nextInt();
        System.out.println(arr[i]);
        System.out.println(arr[i]/b); // no exception in this program ...
         }
        catch(ArithmeticException e){
            System.out.println("Exception caught is " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught is " + e.getMessage());
        }
        finally{
            System.out.println("In the final block");
        }
    }
}
// run time exception...