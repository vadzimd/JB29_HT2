package jb29.unit3.part1;

import java.util.Scanner;

// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26 {

	public static void main(String[] args) {

		int x1;
		int x2;
		int x3;

		int max;
		int min;

		int sum;

		x1 = enterFromConsole("number 1");
		x2 = enterFromConsole("number 2");
		x3 = enterFromConsole("number 3");

		if (x1 >= x2) {
			if (x2 >= x3) {
				max = x1;
				min = x3;
			} else {
				if (x1 >= x3) {
					max = x1;
				} else {
					max = x3;
				}
				min = x2;
			}
		} else {
			if (x2 >= x3) {
				if (x1 >= x3) {
					min = x3;
				} else {
					min = x1;
				}
				max = x2;
			} else {
				max = x3;
				min = x1;
			}
		}

		sum = min + max;

		System.out.println("The sum is: " + sum);

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