package jb29.unit3.part1;

import java.util.Scanner;

// 35. Вычислить число и месяц в невисокосном году по номеру дня.

public class Task35 {

	public static void main(String[] args) {

		int dayNumber;

		dayNumber = enterFromConsole("day number");

		if (dayNumber < 0 || dayNumber > 365) {
			System.out.println("The date doesn't exist");
			System.exit(0);
		} else if (dayNumber <= 31) {

			System.out.println("This is Jan, " + dayNumber);

		} else if (dayNumber <= 59)

		{

			System.out.println("This is Feb, " + (dayNumber - 31));

		}

		else if (dayNumber <= 90)

		{

			System.out.println("This is Mar, " + (dayNumber - 59));

		}

		else if (dayNumber <= 120)

		{

			System.out.println("This is Apr, " + (dayNumber - 90));

		}

		else if (dayNumber <= 151)

		{

			System.out.println("This is May, " + (dayNumber - 120));

		}

		else if (dayNumber <= 181)

		{

			System.out.println("This is Jun, " + (dayNumber - 151));

		} else if (dayNumber <= 212)

		{

			System.out.println("This is Jul, " + (dayNumber - 181));

		} else if (dayNumber <= 243)

		{

			System.out.println("This is Aug, " + (dayNumber - 212));

		} else if (dayNumber <= 273)

		{

			System.out.println("This is Sep, " + (dayNumber - 243));

		} else if (dayNumber <= 304)

		{

			System.out.println("This is Oct, " + (dayNumber - 273));

		} else if (dayNumber <= 334)

		{

			System.out.println("This is Nov, " + (dayNumber - 304));

		} else if (dayNumber <= 365)

		{

			System.out.println("This is Dec, " + (dayNumber - 334));

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