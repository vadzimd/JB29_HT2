package jb29.unit3.part1;

import java.util.Random;

// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

public class Task07 {

	public static void main(String[] args) {

		Random rand = new Random();

		int a;
		int b;
		int c;
		int x;
		int result;

		a = rand.nextInt(50);
		b = rand.nextInt(50);
		c = rand.nextInt(50);
		x = rand.nextInt(50);

		result = Math.abs(a * x * x + b * x + c);

		System.out.println("The result is: " + result);

	}
}