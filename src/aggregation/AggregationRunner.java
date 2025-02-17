package aggregation;

public class AggregationRunner {

    public static void main(String[] args) {
        // Creating students
        Student student1 = new Student("Bobby", 101);
        Student student2 = new Student("Bob", 102);

        // Creating a university and adding students
        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);

        // Display university details
        university.displayStudents();

        // University object is deleted
        university = null;

        // Students still exist independently
        System.out.println("Students still exist after University is deleted:");
        student1.display();
        student2.display();
    }
}
