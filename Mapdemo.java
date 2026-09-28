// Wap to store students unique roll no and marks as key value pair.
// Add details of 5 students and display all the details.
// Remove entry of a particular roll no.
// Search marks using a roll no.
// Update marks of an existing roll no.
package Basics;
import java.util.*;
public class Mapdemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();
        hm.put(1,98);
        hm.put(2,97);
        hm.put(3,96);
        hm.put(4,88);
        hm.put(5,77);
        for(Map.Entry<Integer, Integer> it:hm.entrySet()){
            System.out.println(it.getKey() + " " + it.getValue());
        }
        hm.remove(1);
        if(hm.containsKey(2)){
            System.out.println("Marks of RollNo : " + hm.get(2));
        }
        else{
            System.out.println("Student not found");
        }
        hm.put(2,94); // updation...
        System.out.println(hm.entrySet()); // Printing the whole in one go ...
        for(Map.Entry<Integer, Integer> it: hm.entrySet()){
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }
}

// One row is known as Entry
// All the rows are k/a EntrySet...
