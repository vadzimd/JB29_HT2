package jb29.unit3.part1;

import java.util.Random;

// 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.

public class Task15 {

	public static void main(String[] args) {

		Random rand = new Random();

		double x1;
		double x2;

		x1 = rand.nextDouble();
		x2 = rand.nextDouble();

		if (Double.compare(x1, x2) == 0) {
			x1++;
		}

		if (Double.compare(x1, x2) < 0) {

			x1 = (x1 + x2) / 2;
			x2 = 2 * x1 * x2;
		} else {
			x2 = (x1 + x2) / 2;
			x1 = 2 * x1 * x2;

		}

		System.out.println("x1 = " + x1 + ", x2 = " + x2);

	}
}