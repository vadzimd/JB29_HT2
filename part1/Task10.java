package jb29.unit3.part1;

import java.util.Random;

// 10. Составить программу, которая определит площадь какого круга меньше.

public class Task10 {

	public static void main(String[] args) {

		Random rand = new Random();

		int num1;
		int num2;

		double num1Square;
		double num2Square;

		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);

		num1Square = Math.PI * num1 * num1;
		num2Square = Math.PI * num2 * num2;

		if (Double.compare(num1Square, num2Square) == 0) {

			System.out.println("Both circles have the same square");
		} else if (Double.compare(num1Square, num2Square) < 0) {

			System.out.println("The smallest square is " + num1Square);
		} else {

			System.out.println("The smallest square is " + num2Square);
		}

	}
}