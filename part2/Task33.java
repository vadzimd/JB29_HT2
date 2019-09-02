package jb29.unit3.part2;
import java.util.Scanner;

// 33. Найдите наибольшую цифру данного натурального числа.

public class Task33 {

	public static void main(String[] args) {

		int numPrev = 0;
		int numCur = 0;

		int num = enterIntFromConsole("num");

		while (!(num % 10 == 0 && num < 10)) {

			numCur = num % 10;

			if (numCur >= numPrev)

			{
				numPrev = numCur;
			}
			num = num / 10;
		}

		System.out.println("The biggest digit is " + numPrev);

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
