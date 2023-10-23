package oOP;

import java.util.*;

public class ClassNotFoundExceptions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			//accessing the ArrayList
			System.out.print("Enter the name of a class : ");
			String className = scanner.nextLine();

			try {
				Class<?> classRecord = Class.forName(className);
				System.out.println("Class found: " + classRecord.getName());
			} catch (ClassNotFoundException e) {
				System.err.println("Class Not Found Exception: " + e.getMessage());
			}

			
		}
	}
}