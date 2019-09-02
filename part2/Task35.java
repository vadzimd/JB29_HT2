package jb29.unit3.part2;

import java.util.Scanner;

// 35. Найдите количество четных цифр данного натурального числа.

public class Task35 {

	public static void main(String[] args) {

		int counter = 0;

		int num = enterIntFromConsole("num");

		while (!(num % 10 == 0 && num < 10)) {

			if (num % 10 % 2 == 0) {
				counter++;
			}
			num = num / 10;
		}

		System.out.println("The cound of odd numbers is  " + counter);

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
