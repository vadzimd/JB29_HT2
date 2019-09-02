package jb29.unit3.part2;

import java.math.BigInteger;
import java.util.Scanner;

// 25. Требуется определить факториал числа, которое ввел пользователь.

public class Task25 {

	public static void main(String[] args) {

		int numfrom = 1;
		int numTo;
		BigInteger mult = new BigInteger("1");

		numTo = enterIntFromConsole("n");

		while (numfrom <= numTo) {

			mult = mult.multiply(BigInteger.valueOf(numfrom));
			numfrom++;
		}

		System.out.println("Mult is: " + mult);
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
