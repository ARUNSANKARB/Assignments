package solutions.Day1;

import java.util.Scanner;


public class AttendanceReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {50, 45, 60, 55, 48, 52, 58, 49, 61, 53};

        int[] pre = new int[11];
        for (int i = 1; i <= 10; i++) {
            pre[i] = pre[i - 1] + a[i - 1];
        }

        System.out.print("Enter start day: ");
        int start = sc.nextInt();
        System.out.print("Enter end day: ");
        int end = sc.nextInt();

        if (start < 1 || end > 10 || start > end) {
            System.out.println("Invalid range");
        } else {
            int total = pre[end] - pre[start - 1];
            System.out.println("Total attendance from day " + start + " to " + end + " = " + total);
        }

        int maxDay = 1;
        for (int i = 1; i < 10; i++) {
            if (a[i] > a[maxDay - 1]) {
                maxDay = i + 1;
            }
        }
        System.out.println("Highest attendance is on day " + maxDay + " (" + a[maxDay - 1] + ")");
    }
}

// Think about solution - the running total is the DP part, it takes 10 steps once and then
// every range is just 1 subtraction. The max loop is brute force, it checks all 10 days.
