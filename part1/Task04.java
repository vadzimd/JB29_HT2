package jb29.unit3.part1;

import java.util.Random;

// 4. Составить программу: равны ли два числа а и b?

public class Task04 {

	public static void main(String[] args) {

		Random rand = new Random();

		int num1;
		int num2;

		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);

		if (num1 == num2) {

			System.out.println("num1 = num2");

		} else {
			System.out.println("num1 <> num2");
		}

	}
}