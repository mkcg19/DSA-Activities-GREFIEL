package dsaCompilation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueuesTrees {

    public static void main(String[] args) {
        Stack<String> task = new Stack<>();
        Queue<String> toDoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t\tOptions:");
            System.out.println("1. Task Manager (Stack)");
            System.out.println("2. To-Do List (Queue)");
            System.out.println("3. Trees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        while (true) {
                            System.out.println("\n\t\tTask Manager: ");
                            System.out.println("1. Add a new task");
                            System.out.println("2. Complete the last task");
                            System.out.println("3. Peek at the current task");
                            System.out.println("4. List tasks");
                            System.out.println("5. Exit");
                            System.out.print("Enter your choice: ");
                            try {
                                int choice1 = scanner.nextInt();
                                scanner.nextLine();

                                switch (choice1) {
                                    case 1:
                                        System.out.print("Enter new task: ");
                                        String newTask = scanner.nextLine();
                                        task.push(newTask);
                                        System.out.println("Task added " + newTask);
                                        break;

                                    case 2:
                                        if (task.isEmpty()) {
                                            System.out.println("No tasks to complete.");
                                        } else {
                                            String completedTask = task.pop();
                                            System.out.println("Task completed: " + completedTask);
                                        }
                                        break;

                                    case 3:
                                        if (task.isEmpty()) {
                                            System.out.println("No tasks in the list.");
                                        } else {
                                            String currentTask = task.peek();
                                            System.out.println("Current Task: " + currentTask);
                                        }
                                        break;

                                    case 4:
                                        if (task.isEmpty()) {
                                            System.out.println("No tasks in the list.");
                                        } else {
                                            System.out.println("Task List (from newest to oldest):");
                                            for (String tasks : task) {
                                                System.out.println(tasks);
                                            }
                                        }
                                        break;

                                    case 5:
                                        System.out.println("Exiting the task manager.");
                                        System.exit(0);
                                        break;

                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                        continue;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input. Please enter a valid option.");
                                scanner.nextLine(); 
                                continue;
                            }
                        } // end of the Task Manager option
                        //break;

                    case 2:
                        while (true) {
                            System.out.println("\n\t\tTo-Do List: ");
                            System.out.println("1. Enqueue task");
                            System.out.println("2. Dequeue task");
                            System.out.println("3. Peek at the next task");
                            System.out.println("4. Display all tasks");
                            System.out.println("5. Exit");
                            System.out.print("Enter your choice: ");
                            try {
                                int choice2 = scanner.nextInt();
                                scanner.nextLine();

                                switch (choice2) {
                                    case 1:
                                        System.out.print("Enter the task to enqueue: ");
                                        String toDo = scanner.nextLine();
                                        toDoList.offer(toDo);
                                        System.out.println("Task '" + toDo + "' added to the to-do list.");
                                        break;

                                    case 2:
                                        if (!toDoList.isEmpty()) {
                                            String dequeuedTask = toDoList.poll();
                                            System.out.println("Task '" + dequeuedTask + "' dequeued.");
                                        } else {
                                            System.out.println("To-do list is empty.");
                                        }
                                        break;

                                    case 3:
                                        if (!toDoList.isEmpty()) {
                                            String nextTask = toDoList.peek();
                                            System.out.println("Next task: " + nextTask);
                                        } else {
                                            System.out.println("To-do list is empty.");
                                        }
                                        break;

                                    case 4:
                                        if (!toDoList.isEmpty()) {
                                            System.out.println("To-Do List:");
                                            for (String item : toDoList) {
                                                System.out.println(item);
                                            }
                                        } else {
                                            System.out.println("To-do list is empty.");
                                        }
                                        break;

                                    case 5:
                                        System.out.println("Exiting To-Do List Application...");
                                        scanner.close();
                                        System.exit(0);
                                        break;

                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                        continue;
                                }
                            } catch (Exception e) {
                                System.out.println("Invalid input. Please enter a valid option.");
                                scanner.nextLine();
                                continue;
                            }
                        }
                        //break;

                    case 3:
                        System.out.println("In-Order Traversal: CCC, BB, HH, DD, AA");
                        System.out.println("Pre-Order Traversal: CCC, BB, HH, DD, AA, FF, EE, GG, CC");
                        System.out.println("Post-Order Traversal: CCC, BB, HH, DD, CC, EE, FF, GG, AA");
                        break;

                    case 4:
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice.");
                        continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine(); 
                continue;
            }
        } // 
    }
}
