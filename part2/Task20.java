package jb29.unit3.part2;

import java.util.Scanner;

// 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:

public class Task20 {

	public static void main(String[] args) {

		int numFrom = 0;
		int numTo;
		double e;
		double a;
		double sum = 0;

		numTo = enterIntFromConsole("n");
		e = enterDoubleFromConsole("e");

		while (numFrom <= numTo) {

			a = 1 / ((3 * (double) numFrom - 2) * (3 * (double) numFrom + 1));

			if (Double.compare(Math.abs(a), e) >= 0) {
				sum = sum + a;
			}

			numFrom++;
		}

		System.out.println("The sum is: " + sum);
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
