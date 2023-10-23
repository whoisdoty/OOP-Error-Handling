package oOP;


import java.util.Scanner;

public class NumberFormatExeption {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter a number: ");
			String userInput = scanner.nextLine();

			try {
				int number = Integer.parseInt(userInput);
				System.out.println("Parsed number: " + number);
			} catch (NumberFormatException e) {
				System.err.println("NumberFormatException: " + e.getMessage());
			}
					}
	}
}