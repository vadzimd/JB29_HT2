package jb29.unit3.part2;

import java.util.Scanner;

// 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом.

public class Task24 {

	public static void main(String[] args) {

		int n = 0;
		int m = 0;
		int digit = 1;
		int sum = 0;

		n = enterIntFromConsole("n");

		while (!(n % 10 == 0)) {
			
			m = m * 10;
			digit = n % 10;

			if (digit % 2 == 0) {
				sum = sum + digit;
			}

			m = m + digit;

			n = n / 10;

		}

		System.out.println("Sum: " + sum + ", m = " + m);
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
