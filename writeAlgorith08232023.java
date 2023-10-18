package dsaCompilation;

import java.util.Scanner;

public class writeAlgorith08232023 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		/* Algorithm:
		 * 1. Prompt the user to enter two numbers
		 * 2. Prompt the user to choose an operation (addition, subtraction, multiplication, division).
		 * 3. Based on the user's choice, perform the corresponding operation on the two numbers.
		 * 4. Display the result.
		 */
		
		double num1, num2, result;
		char operator;
		
		System.out.print("Enter first number: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Enter second number: ");
		num2 = scanner.nextDouble();
		
		System.out.print("Choose an operator (+, -, *, /):");
		operator = scanner.next().charAt(0);
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if(num2 != 0) {
				result = num1 / num2;
			}else {
				System.out.println("Error: Division by zero.");
				return;
			}
			break;
		default:
			System.out.println("Invalid operator.");
			return;
		}
		
		System.out.println("Result: " + result);
		
		scanner.close();

	}

}
