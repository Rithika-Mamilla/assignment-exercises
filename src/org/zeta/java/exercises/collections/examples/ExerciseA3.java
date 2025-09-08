package org.zeta.java.exercises.collections.examples;

import java.util.HashMap;

public class ExerciseA3 {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("IND", "India");
        countries.put("US", "USA");
        countries.put("AUS", "Australia");
        countries.put("SA", "South Africa");
        countries.put("SL", "Sri Lanka");
        countries.forEach((key, value) -> System.out.printf("Code: %s & Country: %s%n", key, value));
    }
}
