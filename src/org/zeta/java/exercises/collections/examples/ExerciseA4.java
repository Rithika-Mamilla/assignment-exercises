package org.zeta.java.exercises.collections.examples;

import java.util.TreeSet;

public class ExerciseA4 {
    public static void main(String[] args) {
        TreeSet<String> books = new TreeSet<>();
        books.add("Harry Potter and the Sorcerer's Stone");
        books.add("Vengeance to the Royal Ones");
        books.add("Ignited Minds");
        books.add("The Wings of Fire");
        books.add("The Dead Beautiful");
        books.forEach(book -> System.out.println("Title: " + book));
    }
}
