package exception;

import java.util.Scanner;

public class arrayIndexOutofBounds {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		System.out.print("Enter index: ");
		int index = scanner.nextInt();
		
		try {
			int element = numbers[index];
			System.out.println("Element at index " + index + "is: " + element);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound.");
		}

	}

}
