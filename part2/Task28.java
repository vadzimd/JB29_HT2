package jb29.unit3.part2;

import java.util.Scanner;

// 282. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить результат Z

public class Task28 {

	public static void main(String[] args) {

		double X;
		double Y;
		double Z = 0;
		String operation;
		boolean runProcess = true;
		while (runProcess) {

			X = enterDoubleFromConsole("X");
			Y = enterDoubleFromConsole("Y");
			operation = enterCharFromConsole("operation");

			if (operation.equals("+")) {
				Z = X + Y;
			} else if (operation.equals("-")) {
				Z = X - Y;
			}

			else if (operation.equals("*")) {
				Z = X * Y;
			} else if (operation.equals("/")) {

				if (Double.compare(Y, 0) == 0) {

					System.out.println("You can't divide by zero. Please enter different Y.");
					System.exit(0);
				} else {
					Z = X / Y;
				}

			} else if (operation.equals("0")) {
				runProcess = false;
				System.out.println("Finish.");

				System.exit(0);
			} else {
				System.out.println("Please either enter +, -, * or /");
			}

			System.out.println("Z = " + Z);
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

	public static double enterDoubleFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextDouble()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextDouble();

		return number;

	}
}
