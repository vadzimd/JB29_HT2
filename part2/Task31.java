package jb29.unit3.part2;

import java.util.Random;
import java.util.Scanner;

// 31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также ошибочные числа пользователя.

public class Task31 {

	public static void main(String[] args) {

		Random rand = new Random();

		for (int i = 1; i <= 5; i++) {

			int numComp = rand.nextInt(15);

			int num = enterIntFromConsole("num");

			if (numComp == num) {
				System.out.println("You guessed the number: " + numComp);
			} else {
				System.out.println("You didn't guess the number: " + numComp + ". You entered: " + num);
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
