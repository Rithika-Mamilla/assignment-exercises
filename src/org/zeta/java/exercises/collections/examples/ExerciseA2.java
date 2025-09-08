package org.zeta.java.exercises.collections.examples;

import java.util.HashSet;

public class ExerciseA2 {
    public static void main(String[] args) {
        HashSet<String> emailAddresses = new HashSet<>();
        emailAddresses.add("john@gmail.com");
        emailAddresses.add("bob@gmail.com");
        emailAddresses.add("chloe@gmail.com");
        emailAddresses.add("bob@gmail.com");
        emailAddresses.add("chloe@gmail.com");
        System.out.println("Unique Email Addresses: ");
        emailAddresses.forEach(email -> System.out.println(email));
    }
}
