package jb29.unit3.part1;

import java.util.Random;

// 14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task14 {

	public static void main(String[] args) {

		Random rand = new Random();

		int num1;
		int num2;
		int num3;

		num1 = rand.nextInt(180);
		num2 = rand.nextInt(180);

		num3 = 180 - num1 - num2;

		if (num3 > 0) {

			System.out.println("The triangle exists");

			if (num1 == 90 || num2 == 90 || num3 == 90)

			{
				System.out.println(" and it's right");
			} else {
				System.out.println(" but it's not right");
			}

		} else {
			System.out.println("The triangle doesn't exists");
		}

	}
}