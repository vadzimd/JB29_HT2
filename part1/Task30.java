package jb29.unit3.part1;

import java.util.Scanner;

// 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.

public class Task30 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = enterFromConsole("a");
		b = enterFromConsole("b");
		c = enterFromConsole("c");

		if (Double.compare(a, b) > 0 && Double.compare(b, c) > 0) {

			a = a * a;
			b = b * b;
			c = c * c;
		}

		else {

			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);

		}

		System.out.println("Result: a = " + a + ", b = " + b + ", c = " + c);

	}

	public static double enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double doubl;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextDouble()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		doubl = scanner.nextDouble();

		return doubl;

	}
}