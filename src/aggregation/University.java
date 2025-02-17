package aggregation;

import java.util.ArrayList;
import java.util.List;

public class University {

    public List<Student> students;

    public University() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        if(students.isEmpty()){
            System.out.println("Students are not available");
        }
        else{
            for (Student student : students) {
                student.display();
            }
        }
    }
}
