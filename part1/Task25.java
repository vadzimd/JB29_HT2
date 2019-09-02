package jb29.unit3.part1;

import java.util.Scanner;

// 25. Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.

public class Task25 {

	public static void main(String[] args) {

		int temperature;

		temperature = enterFromConsole("temperature value");

		if (temperature > 60) {
			System.out.println("alarm");
		} else {
			System.out.println("safe");
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