package jb29.unit3.part2;

import java.util.Scanner;

// 6. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task06 {

	public static void main(String[] args) {

		int numfrom = 1;
		int numTo;
		int sum = 0;

		numTo = enterFromConsole("number");

		while (numfrom <= numTo) {

			sum = sum + numfrom;
			numfrom++;
		}

		System.out.println("Sum of odd number is: " + sum);
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
