package jb29.unit3.part2;

import java.util.Scanner;

// 282. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить результат Z

public class Task32 {

	public static void main(String[] args) {

		String string;

		string = enterCharFromConsole("string");

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);

			if (i == 0) {

				if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_')) {

					System.out.println("The char [" + i + "] can't be " + c);
				}
			} else {

				if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == '_' || (c >= '0' && c <= '9'))) {

					System.out.println("The char [" + i + "] can't be " + c);
				}
			}
		}
	}

	public static String enterCharFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String string;

		System.out.println("Enter " + message + ": ");

		string = scanner.nextLine();

		return string;

	}
}
