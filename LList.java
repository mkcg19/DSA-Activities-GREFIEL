package LinkLi;

import java.util.Scanner;
import java.util.LinkedList;

public class LList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t\tOptions");
            System.out.println("1. Add an element");
            System.out.println("2. Display the LinkedList");
            System.out.println("3. Update an element");
            System.out.println("4. Delete an element");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        for (int i = 0; i < 5; i++) {
                            System.out.println("\nEnter element to add: ");
                            String elementToAdd = scanner.nextLine();
                            linkedList.add(elementToAdd);
                            System.out.println(elementToAdd + " has been added.");
                        }
                        System.out.println("Linked List: " + linkedList);
                        break;
                    case 2:
                        System.out.println("LinkedList elements: " + linkedList);
                        break;
                    case 3:
                        System.out.print("\nEnter index of the element to update: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        if (index >= 0 && index < linkedList.size()) {
                            System.out.println("Enter new value: ");
                            String newValue = scanner.nextLine();
                            linkedList.set(index, newValue);
                        } else {
                            System.out.println("Invalid index.");
                        }
                        break;
                    case 4:
                        System.out.println("\nEnter element to delete: ");
                        String elementToDelete = scanner.nextLine();
                        boolean delete = linkedList.remove(elementToDelete);
                        if (delete) {
                            System.out.println(elementToDelete + " has been deleted");
                        } else {
                            System.out.println(elementToDelete + " not found in the list.");
                        }
                        System.out.println("Linked List: " + linkedList);
                        break;
                    case 5:
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
