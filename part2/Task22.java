package jb29.unit3.part2;

import java.util.Scanner;

// 22. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:

public class Task22 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;
		double F;

		a = enterIntFromConsole("a");
		b = enterIntFromConsole("b");
		h = enterIntFromConsole("h");

		System.out.println("-------------------------------------------- ");

		System.out.println("     x    |       F    ");

		while (a <= b) {
			System.out.println("-------------------------------------------- ");
			
			F = Math.pow(Math.sin((double) a), 2);

			System.out.println("     " + a + "    |       " + F + "    ");
			a = a + h;

		}
		System.out.println("-------------------------------------------- ");
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
