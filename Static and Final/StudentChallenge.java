import java.util.*;

class Student {
    private String name;
    private String rollNo;
    private static int studentCount = 1;

    private String getName() {
        return name;
    }

    private String assignRollNo() {
        Date date = new Date();
        return "UNIV-" + (1900 + date.getYear()) + "-" + studentCount++;
    }

    public String getRollNo() {
        return rollNo;
    }

    Student(String name) {
        this.name = name;
        this.rollNo = assignRollNo(); // Assign once
        System.out.println("Name: " + getName() + ", Roll No: " + getRollNo());
    }
}

public class StudentChallenge {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // System.out.println(s1.getRollNo());
        // System.out.println(s2.getRollNo());
        // System.out.println(s3.getRollNo());
    }
}