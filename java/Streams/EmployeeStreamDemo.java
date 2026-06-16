package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

    public static class Employee {
        private String name;
        private String department;
        private double salary;
        private String city;

        public Employee(String name, String department, double salary, String city) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.city = city;
        }

        public String getName() { return name; }
        public String getDepartment() { return department; }
        public double getSalary() { return salary; }
        public String getCity() { return city; }
    }

    public static void main(String[] args) {
        // Generate dataset of 10,000 employees for stream performance test
        List<Employee> employees = new ArrayList<>();
        String[] departments = {"Engineering", "Product", "Sales", "HR", "Finance"};
        String[] cities = {"New York", "San Francisco", "London", "Tokyo", "Bengaluru"};
        
        for (int i = 0; i < 10000; i++) {
            employees.add(new Employee(
                "Emp_" + i,
                departments[i % departments.length],
                30000 + (i * 15) % 150000,
                cities[i % cities.length]
            ));
        }

        System.out.println("--- 1. Stream Operations & Aggregations ---");
        
        // Find top 3 highest paid employees in Engineering
        List<Employee> topEng = employees.stream()
                .filter(e -> e.getDepartment().equals("Engineering"))
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3 Engineering salaries:");
        topEng.forEach(e -> System.out.println("  " + e.getName() + ": $" + e.getSalary()));

        // Group by city
        Map<String, List<Employee>> byCity = employees.stream()
                .limit(100) // limit to show print clearly
                .collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("\nSample Grouping by City (First 100 entries):");
        byCity.forEach((city, list) -> System.out.println("  " + city + ": " + list.size() + " employees"));

        // Calculate average salary of all employees
        double avgSalary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("\nOverall Average Salary: $" + String.format("%.2f", avgSalary));

        System.out.println("\n--- 2. Sequential vs Parallel Streams Benchmark ---");
        
        // Sequential Stream benchmark
        long startTime = System.nanoTime();
        Map<String, Double> avgDeptSalSeq = employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)
                ));
        long endTime = System.nanoTime();
        System.out.println("Sequential Stream Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // Parallel Stream benchmark
        startTime = System.nanoTime();
        Map<String, Double> avgDeptSalPar = employees.parallelStream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingDouble(Employee::getSalary)
                ));
        endTime = System.nanoTime();
        System.out.println("Parallel Stream Time:   " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
