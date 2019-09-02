package jb29.unit3.part1;

import java.util.Random;

// 5. Составить программу: определения наименьшего из двух чисел а и b.

public class Task05 {

	public static void main(String[] args) {

		Random rand = new Random();

		int num1;
		int num2;

		num1 = rand.nextInt(50);
		num2 = rand.nextInt(50);

		if (num1 < num2) {

			System.out.println("The smallest number is: " + num1);

		} else if (num2 < num1) {
			System.out.println("The smallest number is: " + num2);
		} else {
			System.out.println("Both numbers are equal");
		}

	}
}