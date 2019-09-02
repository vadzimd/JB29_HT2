package jb29.unit3.part1;

import java.util.Scanner;

// 27. Найти max{min(a, b), min(c, d)}.

public class Task29 {

	public static void main(String[] args) {

		int x1;
		int x2;
		int x3;

		int y1;
		int y2;
		int y3;

		int a;
		int b;

		x1 = enterFromConsole("number x1");
		y1 = enterFromConsole("number y1");
		x2 = enterFromConsole("number x2");
		y2 = enterFromConsole("number y2");
		x3 = enterFromConsole("number x3");
		y3 = enterFromConsole("number y3");

		a = (y2 - y1) / (x2 - x1);

		b = y1 - a * x1;

		if (y3 == (a * x3 + b)) {

			System.out.println("3 points are on the same line.");

		} else {
			System.out.println("3 points are not on the same line.");
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