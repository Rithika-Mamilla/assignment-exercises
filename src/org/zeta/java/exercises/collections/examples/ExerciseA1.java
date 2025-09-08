package org.zeta.java.exercises.collections.examples;

import java.util.ArrayList;
import java.util.List;

public class ExerciseA1 {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Alan");
        studentNames.add("Bob");
        studentNames.add("John");
        studentNames.add("Chloe");
        studentNames.add("Rose");
        System.out.println("Student Names:");
        studentNames.forEach(name -> System.out.println(name));
    }
}
