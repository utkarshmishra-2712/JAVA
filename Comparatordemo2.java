package Basics;

import java.util.*;

public class Comparatordemo2 {
    public static void main(String[] args) {
        ArrayList <Integer> a  = new ArrayList<Integer>();
        a.add(20);
        a.add(10);
        a.add(30);
        a.add(50);
        ArrayList<Student4> st = new ArrayList<>();
        st.add(new Student4(10, "Rahul", 100));
        st.add(new Student4(9, "Ritest", 90));
        st.add(new Student4(5, "Ritika", 90));
        st.add(new Student4(20, "Meetest", 80));
        st.add(new Student4(11, "Shristi", 98));
        a.sort(new CustomComparator());
        st.sort(new StudentComparator());
        st.sort(new NameComparator());
        System.out.println(st);
        System.out.println(a);
        // Collections.sort(st, new NameComparator()); se bhi hojayega...
    }
}
class Student4{
    int rollNo;
    String name;
    int marks;
    public Student4(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString(){
        return rollNo + " " + name + " " + marks;
    }

}
class StudentComparator implements Comparator<Student4>{
    @Override
    public int compare(Student4 o1, Student4 o2){
        if(o1.marks != o2.marks){
            return o2.marks - o1.marks;
        }
        return o1.rollNo - o2.rollNo;
    }
}

class NameComparator implements Comparator<Student4>{
    @Override
    public int compare(Student4 o1, Student4 o2){
        return o2.name.compareTo(o1.name); // o2-o1 that is descending...
    }
}