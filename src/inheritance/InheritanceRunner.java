package inheritance;

public class InheritanceRunner {

    public static void main(String[] args) {

        FullTimeEmployee employee1 = new FullTimeEmployee("Test A", 101, 5000.00);
        double salaryOfFullTimeEmployee = employee1.calculateSalary();
        System.out.println("Salary of full time employee : " + salaryOfFullTimeEmployee);

        PartTimeEmployee employee2 = new PartTimeEmployee("Test B", 102, 8, 30.00);
        double salaryOfPartTimeEmployee = employee2.calculateSalary();
        System.out.println("Salary of part time employee : " + salaryOfPartTimeEmployee);

    }

}
