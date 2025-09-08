package org.zeta.java.exercises;

public class Employee {
    private static String name;
    private static double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Employee.name = name;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        Employee.salary = salary;
    }
}
