package jb29.unit3.part2;

import java.util.Scanner;

// 7. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task07 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;
		int x;
		int y;

		a = enterFromConsole("a");
		b = enterFromConsole("b");
		h = enterFromConsole("h");

		while (a <= b) {
			x = a;

			if (x > 2) {

				y = x;
				System.out.println("y = " + y);

			}

			else {

				y = (-1) * x;

				System.out.println("y = " + y);

			}

			a = a + h;
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
