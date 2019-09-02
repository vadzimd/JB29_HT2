package jb29.unit3.part1;

import java.util.Scanner;

// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Task31 {

	public static void main(String[] args) {

		int A;
		int B;
		int x;
		int y;
		int z;

		A = enterFromConsole("number A");
		B = enterFromConsole("number B");
		x = enterFromConsole("number x");
		y = enterFromConsole("number y");
		z = enterFromConsole("number z");

		if ((A >= x && B >= y) || (A >= y && B >= x) || (A >= x && B >= z) || (A >= z && B >= x) || (A >= z && B >= y)
				|| (A >= y && B >= z)) {
			System.out.println("The brick fits the hole.");
		}

		else {
			System.out.println("The brick doesn't fit the hole.");
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