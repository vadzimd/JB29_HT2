package jb29.unit3.part1;

import java.util.Random;

// 19. Подсчитать количество положительных среди чисел а, b, с.

public class Task19 {

	public static void main(String[] args) {

		Random rand = new Random();

		int a;
		int b;
		int c;

		int result = 0;

		a = rand.nextInt(10) * -1;
		b = rand.nextInt(10);
		c = rand.nextInt(10);

		System.out.println("Start: a = " + a + ", b = " + b + ", c = " + c);

		if (a > 0) {
			result++;
		}
		if (b > 0) {

			result++;
		}
		if (c > 0) {

			result++;

		}

		System.out.println("Result:  " + result);

	}
}