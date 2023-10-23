package oOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputWithIOException {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			
			try {
System.out.print("Enter data: ");
			String userInput = br.readLine();

				System.out.println("You entered: " + userInput);
			}catch (IOException e) {
					System.err.println("An error occurred while closing the input stream: " + e.getMessage());
				}
			}
		}
	}