package jb29.unit3.part2;

import java.util.Scanner;

// 21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции:

public class Task21 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;
		int x;
		double F;

		a = enterIntFromConsole("a");
		b = enterIntFromConsole("b");
		h = enterIntFromConsole("h");

		System.out.println("-------------------------------------------- ");

		System.out.println("     x    |       F    ");

		while (a <= b) {
			System.out.println("-------------------------------------------- ");

			x = a;
			F = (double) x - Math.sin((double) a);

			System.out.println("     " + x + "    |       " + F + "    ");
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
