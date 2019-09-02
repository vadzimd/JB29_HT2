package jb29.unit3.part1;

import java.util.Random;

// 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.

public class Task01 {

	public static void main(String[] args) {

		Random rand = new Random();

		int num1;
		int num2;

		num1 = rand.nextInt(50);
		num2 = rand.nextInt(50);

		if (num1 < num2) {

			System.out.println("7");

		} else {
			System.out.println("8");
		}

	}
}