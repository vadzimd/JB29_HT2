package jb29.unit3.part1;

import java.util.Scanner;

// 24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п.

public class Task24 {

	public static void main(String[] args) {

		int n;

		n = enterFromConsole("n");

		if (n % 2 == 0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

	}

	public static int enterFromConsole(String message) {
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