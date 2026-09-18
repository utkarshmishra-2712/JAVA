package Basics;
import java.util.*;
public class ArrayList1 {

    public static void addMarks(List<Integer> marks, int mark) {
        marks.add(mark);
    }

    public static double calculateAverage(List<Integer> marks) {
        double sum = 0.0;
        for(int i : marks){
            sum += i;
        }
        return sum/marks.size();
    }

    public static int findHighest(List<Integer> marks) {
        int highest = marks.get(0);
        for(int i: marks){
            if(i>highest){
                highest = i;
            }
        }
        return highest;
    }

    public static void displayMarks(List<Integer> marks) {
        Iterator <Integer> it = marks.iterator(); // Iterator is a collection itself...
        while(it.hasNext()) // jab tk value hai
        {
            System.out.println(it.next()); // it.next() prints the current ele and performs ++ (like postfix...)
        }
    }

    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        addMarks(marks, 78);
        addMarks(marks, 85);
        addMarks(marks, 92);
        addMarks(marks, 67);
        addMarks(marks, 88);

        displayMarks(marks);

        System.out.println("Average: " + calculateAverage(marks));
        System.out.println("Highest: " + findHighest(marks));
    }
}
