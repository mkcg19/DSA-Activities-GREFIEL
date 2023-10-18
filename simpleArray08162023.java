package simpleArray;

import java.util.Scanner;

public class simpleArray08162023 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String[] array = new String[5];
		
		while(true) {
			System.out.println("\t\tSIMPLE ARRAY CRUD");
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				// Create
				for(int i = 0; i < array.length; i++) {
					System.out.print("Enter a name: ");
					array[i] = scanner.nextLine();
				}
				System.out.println();
				break;
			case 2:
				// Read
				System.out.print("Array elements: ");
				for(String element : array) {
					System.out.print(element + " ");
				}
				System.out.println();
				break;
			case 3:
				// Update
				System.out.print("\nEnter the index of the element to update: ");
				int index = scanner.nextInt();
				scanner.nextLine();
				if(index >= 0 && index < array.length) {
					System.out.print("Enter the new name: ");
					String newName = scanner.nextLine();
					array[index] = newName;
					System.out.println("Name updated sucessfully at index " + index);
				} else {
					System.out.println("Invalid index. Update failed.");
				}
				System.out.println();
				break;
			case 4:
				// Delete
				System.out.print("Enter index of the element to delete: ");
				int indexToDelete = scanner.nextInt();
				scanner.nextLine();
				if(indexToDelete >= 0 && indexToDelete < array.length) {
					array[indexToDelete] = null; 
					System.out.println("Element deleted sucessfully."); 
				} else {
					System.out.println("Invalid index. Delete failed.");
				}
				break;
			case 5:
				scanner.close();
                System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid choice.\n");
                continue;
			}
		}
		
	}

}
