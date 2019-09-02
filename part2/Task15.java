package jb29.unit3.part2;

import java.util.Scanner;

// 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.

public class Task15 {

	public static void main(String[] args) {

		int numFrom = 0;
		int numTo;

		double sum = 0.0;

		numTo = enterIntFromConsole("n");

		while (numFrom <= numTo) {

			sum = sum + Math.pow(2, numFrom);

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
