package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ioException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("An IOException occurred while reading the file:");
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }

	}

}
