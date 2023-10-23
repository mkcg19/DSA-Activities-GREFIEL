package exception;

import java.util.Scanner;

public class illegalArgumentException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		try {
			System.out.print("Enter a number: ");
			int userInput = scanner.nextInt();
			
			if(userInput < 0) {
				throw new IllegalArgumentException("Input cannot be negative");
			}else {
				System.out.println("You entered: " + userInput);
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		scanner.close();

	}

}
