package Basics;

import java.util.*;

public class CourseAnalysis {

    public static Set<Integer> commonStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {
        Set<Integer> commonStudents = new HashSet<>();
        commonStudents.addAll(javaStudents);
        commonStudents.retainAll(pythonStudents);
        return commonStudents;
    }

    public static Set<Integer> allStudents(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {
        Set<Integer> allStudents = new HashSet<>();
        allStudents.addAll(javaStudents);
        allStudents.addAll(pythonStudents); // Combines both sets and automatically removes duplicates
        return allStudents;
    }

    public static Set<Integer> onlyJava(
            Set<Integer> javaStudents,
            Set<Integer> pythonStudents) {
        Set<Integer> java = new HashSet<>();
        java.addAll(javaStudents);
        java.removeAll(pythonStudents); // Removes students who are also in the Python course
        return java;
    }

    public static void main(String[] args) {

        Set<Integer> javaStudents =
                new HashSet<>(
                        Arrays.asList(101, 102, 103, 104));

        Set<Integer> pythonStudents =
                new HashSet<>(
                        Arrays.asList(103, 104, 105, 106));

        System.out.println("Both: "
                + commonStudents(javaStudents, pythonStudents));

        System.out.println("Either: "
                + allStudents(javaStudents, pythonStudents));

        System.out.println("Only Java: "
                + onlyJava(javaStudents, pythonStudents));
    }
}

