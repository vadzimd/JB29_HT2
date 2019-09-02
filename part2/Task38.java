package jb29.unit3.part2;

import java.util.Scanner;

// 38. Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.

public class Task38 {

	public static void main(String[] args) {

		int numPrev = 0;
		int numCur;
		int numDifCur = 0;
		int numDifPrev = 0;

		int num = enterIntFromConsole("num");
		
		numPrev = num % 10;
		numDifPrev = num % 10 - (num / 10) % 10;
		num = num / 10;
		
		while (!(num % 10 == 0 && num < 10)) {

			numCur = num % 10;
			numDifCur = numPrev - numCur;

			if (!(numDifCur == numDifPrev)) {
				System.out.println("False.");
				System.exit(0);
			}
			numPrev = numCur;
			numDifPrev = numDifCur;

			num = num / 10;

		}
		System.out.println("True.");

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
