package exception;

import java.util.Scanner;

public class classNotFoundException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter name of the class: ");
		String className = scanner.nextLine();
		
		try {
			Class<?>loadedClass = Class.forName(className);
			System.out.println(className + " loaded successfully.");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found: " + e.getMessage());
		}

		scanner.close();

	}

}
