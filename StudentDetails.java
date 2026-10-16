package Basics;
import java.util.*;
public class StudentDetails {
    public static void main(String[] args) {
        List<Student2> li = new LinkedList<>();
        li.add(new Student2("A", 19, 90));
        li.add(new Student2("B",  20, 91));
        li.add(new Student2("C", 22, 92));
        Iterator<Student2> it = li.iterator();
        while(it.hasNext()){
            Student2 currStudent =  it.next();
            currStudent.display();
        }
    }
}

class Student2{
    String name;
    int rollNo;
    int marks;
    Student2(String n, int x, int m){
        this .name  = n;
        this.rollNo = x;
        this.marks = m;
    }
    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll No : " + this.rollNo);
        System.out.println("Marks : " + this.marks);
    }
}

// Next question -> WAP to raise a used-defined exception InvalidMarks if total marks < 0;