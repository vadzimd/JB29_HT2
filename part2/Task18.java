package jb29.unit3.part2;

import java.util.Scanner;

// 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:

public class Task18 {

	public static void main(String[] args) {

		int numFrom = 1;
		int numTo;
		double e;
		double a;
		double sum = 0;

		numTo = enterIntFromConsole("n");
		e = enterDoubleFromConsole("e");

		while (numFrom <= numTo) {

			a = Math.pow(-1, numFrom - 1) / (double) numFrom;

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
