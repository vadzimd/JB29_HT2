package jb29.unit3.part1;

import java.util.Random;

// 20. Определить, делителем каких чисел а, b, с является число k.

public class Task20 {

	public static void main(String[] args) {

		Random rand = new Random();

		int a;
		int b;
		int c;
		int k;

		String message = "The result: ";

		a = rand.nextInt(10) * -1;
		b = rand.nextInt(10);
		c = rand.nextInt(10);
		k = rand.nextInt(10) + 1;

		System.out.println("Data: a = " + a + ", b = " + b + ", c = " + c + ", k = " + k);

		if (a % k == 0) {

			message = message + "a ";
		}
		if (b % k == 0) {

			message = message + "b ";
		}
		if (c % k == 0) {

			message = message + "c ";

		}

		System.out.println(message);

	}
}