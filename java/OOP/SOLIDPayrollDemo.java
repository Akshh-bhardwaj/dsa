package OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface Segregation Principle (ISP): Split interfaces into granular functions.
 */
interface Payable {
    double calculateSalary();
}

interface Benficiary {
    double getBenefits();
}

/**
 * Abstract class representing the base model.
 * Dependency Inversion Principle (DIP): Calculations depend on the abstraction (Employee).
 */
abstract class Employee implements Payable {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Type=" + this.getClass().getSimpleName() + "]";
    }
}

/**
 * Open/Closed Principle (OCP): Subclasses can extend Employee to define new payment behaviors
 * without changing the Payroll System logic.
 */
class FullTimeEmployee extends Employee implements Benficiary {
    private double monthlySalary;
    private double benefitsAmount;

    public FullTimeEmployee(String id, String name, double monthlySalary, double benefitsAmount) {
        super(id, name);
        this.monthlySalary = monthlySalary;
        this.benefitsAmount = benefitsAmount;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + getBenefits();
    }

    @Override
    public double getBenefits() {
        return benefitsAmount;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

/**
 * Single Responsibility Principle (SRP): Dedicated class responsible solely for processing payroll.
 */
class PayrollSystem {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    /**
     * Liskov Substitution Principle (LSP): We can pass any subclass of Employee
     * (FullTime or PartTime) without modifying or breaking this method.
     */
    public void processPayroll() {
        System.out.println("Processing Payroll: ");
        for (Employee emp : employees) {
            double netPay = emp.calculateSalary();
            System.out.println("  " + emp + " -> Net Salary: $" + netPay);
        }
    }
}

public class SOLIDPayrollDemo {
    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();

        // Adding full time and part time employees (Dynamic Dispatch / Runtime Polymorphism)
        payroll.addEmployee(new FullTimeEmployee("F101", "Alice", 5000.00, 800.00));
        payroll.addEmployee(new PartTimeEmployee("P201", "Bob", 35.00, 80));

        payroll.processPayroll();
    }
}
