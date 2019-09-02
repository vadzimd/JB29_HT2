package jb29.unit3.part2;

import java.util.Scanner;

// 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности.

public class Task12 {

	public static void main(String[] args) {

		int numfrom = 2;
		int numTo;
		int numN = 1;
		int mult = 1;

		numTo = enterFromConsole("n");

		while (numfrom <= numTo) {
			
			numN = numN + 6;
			mult = mult * numN;

			numfrom++;
		}

		System.out.println("Mult is: " + mult);
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
