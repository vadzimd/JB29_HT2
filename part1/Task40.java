package jb29.unit3.part1;

import java.util.Scanner;

// 40. Вычислить значение функции:

public class Task40 {

	public static void main(String[] args) {

		int x;
		double F;

		x = enterFromConsole("x");

		if (x <= 13) {

			F = (double) (-1) * Math.pow(x, 3) + 9;

		}

		else {
			F = (double) (-3) / (x + 1);

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