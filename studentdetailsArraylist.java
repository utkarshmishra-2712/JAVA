package Basics;
import java.util.ArrayList;
import java.util.List;
public class studentdetailsArraylist {
    public static void main(String[] args) {

        List<Student3> li = new ArrayList<>();
        try{
        li.add(new Student3("A", 1, 50));
        li.add(new Student3("B", 2, 100));
        li.add(new Student3("C", 3, -20));
        li.add(new Student3("D", 4, 40));
        }
        catch(InvalidMarksException e){
            System.out.println(e);
        }
    }
}
class Student3{
    String name;
    int rollno;
    int tmarks;

    public Student3(String name, int rollno, int tmarks) throws InvalidMarksException
    {
        if(tmarks<0) throw new InvalidMarksException("Marks cannot be negative");
        this.name = name;
        this.rollno = rollno;
        this.tmarks = tmarks;
    }
    void display(){
        System.out.println("Name : " + this.name + "Roll No : " + this.rollno + "TMarks : " + this.tmarks);
    }
}

class InvalidMarksException extends Exception{
    InvalidMarksException(String msg){
        super(msg);
    }
}