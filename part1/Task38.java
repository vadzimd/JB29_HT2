package jb29.unit3.part1;

import java.util.Scanner;

// 38. Вычислить значение функции:

public class Task38 {

	public static void main(String[] args) {

		int x;
		int F;

		x = enterFromConsole("x");

		if (x >= 0 && x <= 3) {

			F = x * x;

		}

		else {
			F = 4;

		}

		System.out.println("F = " + F);

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