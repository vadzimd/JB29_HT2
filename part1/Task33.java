package jb29.unit3.part1;

import java.util.Scanner;

// 33. Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.

public class Task33 {

	public static void main(String[] args) {

		int password;

		password = enterFromConsole("password");

		switch (password) {
		case 9583:
		case 1747: {
			System.out.println("You got access to A, B, C databases");
			break;
		}
		case 3331:
		case 7922: {
			System.out.println("You got access to B, C databases");
			break;
		}

		case 9455:
		case 8997: {
			System.out.println("You got access to C database");
			break;
		}
		default: {
			System.out.println("You have no access");
			break;
		}

		}
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