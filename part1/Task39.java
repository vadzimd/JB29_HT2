package jb29.unit3.part1;

import java.util.Scanner;

// 39. Вычислить значение функции:

public class Task39 {

	public static void main(String[] args) {

		int x;
		double F;

		x = enterFromConsole("x");

		if (x >= 8) {

			F = (double) (-1) * x * x + x - 9;

		}

		else {
			F = (double) 1 / (Math.pow(x, 4) - 6);

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