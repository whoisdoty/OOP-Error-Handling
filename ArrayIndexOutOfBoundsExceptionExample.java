package oOP;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        while(true){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an index to access the array: ");
        int index = scanner.nextInt();

        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
}
