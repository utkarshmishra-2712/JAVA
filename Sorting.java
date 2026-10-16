package Basics;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(9);
        li.add(8);
        li.add(10);
        li.add(11);
        li.sort(null); // comparable already defined hai ordering -> ascending...
        // Custom banana predefined class pe to will do ->
        li.sort(Collections.reverseOrder()); // ye predefined class hai i.e. Integer, String then we can use this
        Iterator<Integer> it = li.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(li);
    }
}
