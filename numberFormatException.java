package exception;

import java.util.Scanner;

public class numberFormatException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		String userInput = scanner.nextLine();
		
		try {
			int number = Integer.parseInt(userInput);
			System.out.println(number);
		}catch (NumberFormatException e){
			System.out.println("Invalid input.");
		}
		
		scanner.close();

	}

}
