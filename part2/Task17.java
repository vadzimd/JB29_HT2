package jb29.unit3.part2;

import java.util.Scanner;

// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {

	public static void main(String[] args) {

		double a;
		double aN;
		int numFrom = 1;
		int numTo;
		double mult = 1;

		a = enterDoubleFromConsole("a");
		numTo = enterIntFromConsole("n");

		while (numFrom < numTo) {

			aN = a + (double) numFrom;
			mult = mult * aN;

			numFrom++;
		}

		System.out.println("Mult is: " + mult);
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

	public static double enterDoubleFromConsole(String message) {
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
