package oOP;

import java.util.*;

public class NullPointerExceptions{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a string: ");
			String userInput = scanner.nextLine();

			try {
				// Attempt to get the length of the user input
				int length = userInput.length();
				System.out.println("Length of the input string: " + length);
			} catch (NullPointerException e) {
				System.err.println("NullPointerException: " + e.getMessage());
			}

		}
	}
}