package solutions.Day1.Assignment2;

import java.util.*;



public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List: " + list);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Size: " + list.size());
        list.addFirst(5);
        System.out.println("After inserting at first: " + list);

        list.addLast(50);
        System.out.println("After adding last: " + list);
        list.removeFirst();
        System.out.println("After deleting first: " + list);
        list.removeLast();
        System.out.println("After deleting last: " + list);
        System.out.println("Last element: " + list.getLast());
        System.out.println("Final size: " + list.size());
    }
}
