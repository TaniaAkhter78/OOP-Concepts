package aggregation;

public class Student {

//    6. Aggregation Assignment (University & Students)
//    Scenario:
//    A University has multiple students, but students can exist independently.
//            Task:
//    Create a Student class with name and rollNo.
//    Create a University class containing multiple Student objects.
//    Students should exist even if the University is removed.

    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}
