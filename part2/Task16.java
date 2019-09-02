package jb29.unit3.part2;

import java.util.Scanner;

// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task16 {

	public static void main(String[] args) {

		int numfrom = 1;
		int numTo;
		int numN = 0;
		double mult = 1;

		numTo = enterFromConsole("n");

		while (numfrom <= numTo) {

			numN = numN + numfrom;
			mult = mult * (double) numN;

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
