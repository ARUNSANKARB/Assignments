package solutions.Day1.Assignment1;

import java.util.*;

public class Queue1 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Hermione");
        queue.add("Draco");
        queue.add("Ronaldo");
        queue.add("Harry");

        System.out.println("Queue: " + queue);
        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        System.out.println("Remaining: " + queue);
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}
