package org.zeta.java.exercises.collections.lists;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    private static List<Integer> integers;
    private static void reverse(List<Integer> integers){
        int left = 0;
        int right = integers.size() - 1;
        while (left < right) {
            int temp = integers.get(left);
            integers.set(left, integers.get(right));
            integers.set(right, temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        System.out.println("List of Integers: " + integers);
        reverse(integers);
        System.out.println("Reverse List: " + integers);
    }
}
