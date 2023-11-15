package KT7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TallySales {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        fillTheList(employees);

        // Calculate the total bonus amount
        double totalBonus = employees.stream()
                .filter(employee -> employee.getScore() >= 3)
                .mapToDouble(employee -> 100.0)
                .sum();

        // Print the total bonus amount
        System.out.println(totalBonus);
    }

    private static void fillTheList(List<Employee> employees) {
        employees.add(new Employee("Barry", 2));
        employees.add(new Employee("Harriet", 3));
        employees.add(new Employee("Jennie", 5));
        employees.add(new Employee("Sam", 5));
    }
}
