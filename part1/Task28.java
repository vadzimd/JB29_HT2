package jb29.unit3.part1;

import java.util.Scanner;

// 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).

public class Task28 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = enterFromConsole("number a");
		b = enterFromConsole("number b");
		c = enterFromConsole("number c");
		d = enterFromConsole("number d");

		if (a == d) {
			System.out.println("a = d ");
		} else if (b == d) {
			System.out.println("b = d ");

		} else if (c == d) {
			System.out.println("c = d ");
		} else {

			int d1 = d - a;
			int d2 = d - b;
			int d3 = d - c;

			int max;

			if (d1 >= d2) {
				if (d2 >= d3) {
					max = d1;
				} else {
					if (d1 >= d3) {
						max = d1;
					} else {
						max = d3;
					}
				}
			} else {
				if (d2 >= d3) {
					max = d2;
				} else {
					max = d3;
				}
			}

			System.out.println("max(d — a, d — b, d —c) is: " + max);

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