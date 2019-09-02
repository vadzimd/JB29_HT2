package jb29.unit3.part2;

import java.util.Scanner;

// 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task29 {

	public static void main(String[] args) {

		int a;
		int b;
		int d;
		int c;

		a = enterIntFromConsole("a");
		b = enterIntFromConsole("b");

		while (a > 0) {

			d = a % 10;
			a = a / 10;
			c = b;
			while (c > 0) {
				if (c % 10 == d) {
					System.out.println("--> " + d);

				}
				c = c / 10;
			}
		}

	}

	public static int enterIntFromConsole(String message) {
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
