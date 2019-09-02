package jb29.unit3.part1;

import java.util.Scanner;

// 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.

public class Task23 {

	public static void main(String[] args) {

		int year;
		int month;
		int day;
		int isLeapYear = 0;

		year = enterFromConsole("year");
		month = enterFromConsole("month");
		day = enterFromConsole("day");

		if (day <= 0 || month <= 0 || year <= 0) {
			System.out.println("The date doesn't exist: " + day + "." + month + "." + year);
			System.exit(0);
		}

		if ((year % 4 == 0) && year % 100 != 0) {
			isLeapYear = 1;
		}

		switch (month) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			if (day > 31) {
				System.out.println("The date doesn't exist: " + day + "." + month + "." + year);
				break;
			}
		}
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 30) {
				System.out.println("The date doesn't exist: " + day + "." + month + "." + year);
				break;
			}
		case 2:
			if ((isLeapYear == 0 && day > 28) || (isLeapYear == 1 && day > 29)) {
				System.out.println("The date doesn't exist: " + day + "." + month + "." + year);
				break;
			}

		}
		System.out.println("The date exists: " + day + "." + month + "." + year);

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