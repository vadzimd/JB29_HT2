package jb29.unit3.part2;

import java.util.Scanner;

// 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.

public class Task13 {

	public static void main(String[] args) {

		double numFrom;
		double numTo;
		double y;

		numFrom = enterFromConsole("start from");
		numTo = enterFromConsole("end to");

		while (numFrom <= numTo) {

			y = 5 - ((numFrom * numFrom) / 2);

			System.out.println("y = " + y);

			numFrom = numFrom + 0.5;
		}

	}

	public static double enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextDouble()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextDouble();

		return number;

	}

}
