package jb29.unit3.part2;

import java.util.Scanner;

// 27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицыи самого числа. m и n вводятся с клавиатуры.

public class Task27 {

	public static void main(String[] args) {

		int m;
		int n;
		int Num;

		m = enterIntFromConsole("m");
		n = enterIntFromConsole("n");
		Num = enterIntFromConsole("Num");

		while (m <= n) {

			if (m == 0) {
				m = m + 1;
			}

			if (Num % m == 0 && Num != m && m != 1) {

				System.out.println("Num can be divided by " + m);

			}

			m = m + 1;

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
