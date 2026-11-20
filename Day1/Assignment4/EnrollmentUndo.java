package solutions.Day1.Assignment4;

import java.util.Scanner;
import java.util.Stack;
public class EnrollmentUndo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        boolean running = true;

        while (running) {
            System.out.println("\n1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter learner name: ");
                    String name = sc.nextLine();
                    stack.push(name);
                    System.out.println("Enrolled: " + name);
                    break;
                case "2":
                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo");
                    } else {
                        System.out.println("Undone: " + stack.pop());
                    }
                    break;
                case "3":
                    if (stack.isEmpty()) {
                        System.out.println("Nothing to undo");
                    } else {
                        System.out.println("Last enrolled: " + stack.peek());
                    }
                    break;
                case "4":
                    running = false;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid choice,try again");
            }
        }
    }
}

// Think about solution - undo should remove the most recent action and a stack gives last in
// first out and a queue would remove the oldest enrollment which is not what undo means.