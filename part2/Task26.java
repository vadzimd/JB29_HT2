package jb29.unit3.part2;

import java.util.Scanner;

// 26. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).

public class Task26 {

	public static void main(String[] args) {

		char character;
		int ascii = 0;

		while (ascii <= 255) {

			character = (char) ascii;

			System.out.println("Char: " + character + ", ascii = " + ascii);

			ascii++;

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
