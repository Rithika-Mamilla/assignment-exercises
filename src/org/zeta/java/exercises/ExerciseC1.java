package org.zeta.java.exercises;

import java.util.HashSet;

public class ExerciseC1 {
    public static void main(String[] args) {
        String[] values = {"Apple", "Banana", "Apple", "Grape", "Orange", "Grape", "Apple", "Banana", "Kiwi", "Orange"};
        HashSet<String> fruits = new HashSet<>();
        for (String value : values) {
            fruits.add(value);
        }
        System.out.println("Uniqiue Fruits: ");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
