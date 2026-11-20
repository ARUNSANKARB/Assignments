package solutions.Day1.Assignment5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class BatchWaitlist {
    static String[] seats = new String[3];
    static Queue<String> waitlist = new LinkedList<>();

    static void join(String name) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == null) {
                seats[i] = name;
                return;
            }
        }
        waitlist.offer(name); // no empty seat
    }
    static void drop(String name) {
        for (int i = 0; i < seats.length; i++) {
            if (name.equals(seats[i])) {
                if (waitlist.isEmpty()) {
                    seats[i] = null; // nobody waiting, seat stays empty
                } else {
                    seats[i] = waitlist.poll(); // first in waitlist gets the seat
                }
                return;
            }
        }
        System.out.println(name + " is not in the batch");
    }

    static void print() {
        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + waitlist);
        System.out.println();
    }





    public static void main(String[] args) {
        String[] learners = {"Asha", "Ravi", "Meena", "Kiran", "Pooja"};
        for (String l : learners) {
            System.out.println(l + " joins");
            join(l);
            print();
        }

        System.out.println("Ravi drops out");
        drop("Ravi");
        print();

        System.out.println("Suresh drops out");
        drop("Suresh"); // edge case: not in the batch
        print();
    }
}

// Think about - a queue is fair because whoever waited longest gets the seat first and then
// with a stack the newest person would get the seat and the earliest one would keep waiting.
