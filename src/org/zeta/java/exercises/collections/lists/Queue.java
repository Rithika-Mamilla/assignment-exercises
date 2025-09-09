package org.zeta.java.exercises.collections.lists;

import java.util.LinkedList;

public class Queue {
    private static java.util.Queue<Integer> queue;

    private static void enqueue(int element) {
        queue.offer(element);
    }

    private static int dequeue() {
        if (!queue.isEmpty()) {
            return queue.poll();
        }
        return -1;
    }

    private static void peek() {
        if(queue.isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Peek: " + queue.peek());
        }
    }

    public static void main(String[] args) {
        queue = new LinkedList<>();
        peek();
        enqueue(1);
        System.out.println("Queue: " + queue);
        enqueue(2);
        System.out.println("Queue: " + queue);
        peek();
        enqueue(3);
        System.out.println("Queue: " + queue);
        System.out.println("Dequeue Element: " + dequeue());
        System.out.println("Queue: " + queue);
        enqueue(4);
        System.out.println("Queue: " + queue);
        enqueue(5);
        System.out.println("Queue: " + queue);
        peek();
        enqueue(6);
        System.out.println("Queue: " + queue);
        System.out.println("Dequeue Element: " + dequeue());
        System.out.println("Queue: " + queue);
        enqueue(7);
        System.out.println("Queue: " + queue);
        peek();
    }
}
