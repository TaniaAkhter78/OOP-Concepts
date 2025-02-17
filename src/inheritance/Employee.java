package inheritance;

public class Employee {

//    Inheritance Assignment (Employee Management System)
//    Scenario:
//    A company has different types of employees:
//    Employee (base class)
//    FullTimeEmployee (inherits Employee)
//    PartTimeEmployee (inherits Employee)
//    Each employee has a name, ID, and salary, but full-time and part-time employees have different salary structures.
//    Task:
//    Create an Employee class with name, employeeId, and calculateSalary().
//    Create FullTimeEmployee and PartTimeEmployee, both extending Employee, and override calculateSalary().
//    Calculate and print salaries for both.

    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double calculateSalary(){
        return 0.0;
    }


}
