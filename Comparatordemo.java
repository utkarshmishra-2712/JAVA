package Basics;
import java.util.*;
public class Comparatordemo{
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(100);
        marks.add(45);
        marks.add(67);
        marks.add(99);
        marks.sort(new CustomComparator());
        Iterator<Integer> it = marks.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer O1, Integer O2){
        return O2-O1; // Descending hai to 02-O1 and Ascending hai to 01-02;
    }
}
