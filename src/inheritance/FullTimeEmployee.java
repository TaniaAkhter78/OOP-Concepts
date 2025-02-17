package inheritance;

public class FullTimeEmployee extends Employee {

    double baseSalary;

    public FullTimeEmployee(String name, int employeeId, double baseSalary) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
