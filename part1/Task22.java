package jb29.unit3.part1;

import java.util.Random;

// 22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

public class Task22 {

	public static void main(String[] args) {

		Random rand = new Random();

		int x;
		int y;
		int temp = 0;

		x = rand.nextInt(10);
		y = rand.nextInt(10);

		System.out.println("Start: x = " + x + ", y = " + y);

		if (x < y) {

			temp = x;
			x = y;
			y = temp;

		}

		System.out.println("Result: x = " + x + ", y = " + y);

	}
}