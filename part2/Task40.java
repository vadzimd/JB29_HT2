package jb29.unit3.part2;

import java.util.Scanner;

// 40. Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.

public class Task40 {

	public static void main(String[] args) {

		int numCur;
		int numA;
		boolean result = true;

		int num = enterIntFromConsole("num");

		for (int A = 1; A < num; A++) {

			result = true;
			numA = A;

			while (!(numA % 10 == 0 && numA < 10)) {

				numCur = numA % 10;

				if (!(numCur == 0)) {

					if (!(A % numCur == 0)) {
						result = false;

					}
				}

				numA = numA / 10;

			}
			if (result) {
				System.out.println("A = " + A);
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
