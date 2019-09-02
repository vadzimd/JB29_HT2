package jb29.unit3.part1;

import java.util.Random;

// 9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.

public class Task09 {

	public static void main(String[] args) {

		Random rand = new Random();

		int num1;
		int num2;
		int num3;

		num1 = rand.nextInt(3);
		num2 = rand.nextInt(3);
		num3 = rand.nextInt(3);

		if (num1 == num2 && num2 == num3) {

			System.out.println("The triangle is equilateral");

		} else {
			System.out.println("The triangle is not equilateral");
		}

	}
}