package org.zeta.java.exercises.collections.sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomSorting {
    public static void main(String[] args) {
        Comparator<Employee> salaryComparator = (e1, e2) -> {
            int compare = Double.compare(e2.getSalary(), e1.getSalary());
            return compare;
        };

        Set<Employee> employees = new TreeSet<>(salaryComparator);
        employees.add(new Employee("John", 30000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Rosie", 55000));
        employees.add(new Employee("Bob", 40000));
        employees.add(new Employee("Kyle", 25000));

        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
