package jb29.unit3.part2;

import java.util.Scanner;

// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Task14 {

	public static void main(String[] args) {

		int numFrom = 1;
		int numTo;

		double sum = 0.0;

		numTo = enterIntFromConsole("n");

		while (numFrom <= numTo) {

			sum = sum + (1 / (double) numFrom);

			numFrom++;
		}

		System.out.println("Sum: " + sum);
	}

	public static int enterIntFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextInt()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextInt();

		return number;

	}

}
