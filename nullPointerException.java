package exception;

import java.util.Scanner;

public class nullPointerException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		
		try {
			int length = str.length();
			System.out.println("Length of the string: " + length);
		} catch (NullPointerException e){
			System.out.println("The string is null.");
		}
		
		scanner.close();

	}

}
