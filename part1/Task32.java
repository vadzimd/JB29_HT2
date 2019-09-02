package jb29.unit3.part1;

import java.util.Scanner;

// 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).

public class Task32 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		int isSumPlus = 0;

		a = enterFromConsole("number a");
		b = enterFromConsole("number b");
		c = enterFromConsole("number c");

		if ((a + b) >= 0) {
			isSumPlus = 1;

		} else if ((b + c) >= 0) {
			isSumPlus = 1;

		} else if ((a + c) >= 0) {
			isSumPlus = 1;

		}
		if (isSumPlus == 1) {
			System.out.println("There is at least one positive sum");
		} else {
			System.out.println("All sums are negative");

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