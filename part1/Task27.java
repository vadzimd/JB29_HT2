package jb29.unit3.part1;

import java.util.Scanner;

// 27. Найти max{min(a, b), min(c, d)}.

public class Task27 {

	public static void main(String[] args) {

		int x1;
		int x2;
		int x3;
		int x4;

		int minab;
		int mincd;

		int max;

		x1 = enterFromConsole("number a");
		x2 = enterFromConsole("number b");
		x3 = enterFromConsole("number c");
		x4 = enterFromConsole("number d");

		if (x1 <= x2) {
			minab = x1;
		} else {
			minab = x2;
		}

		if (x3 <= x4) {
			mincd = x3;
		} else {
			mincd = x4;
		}

		if (minab <= mincd) {
			max = minab;
		} else {
			max = mincd;
		}

		System.out.println("The result is: " + max);

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