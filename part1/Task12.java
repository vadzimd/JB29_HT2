package jb29.unit3.part1;

import java.util.Random;

// 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.

public class Task12 {

	public static void main(String[] args) {

		Random rand = new Random();

		double double1;
		double double2;
		double double3;

		double result1;
		double result2;
		double result3;

		double1 = rand.nextDouble();
		double2 = rand.nextDouble();
		double3 = rand.nextDouble();

		if (double1 < 0) {

			result1 = Math.pow(double1, 4);

			System.out.println("The result1 is : " + result1);

		} else {
			result1 = Math.pow(double1, 2);
			System.out.println("The result1 is : " + result1);
		}

		if (double2 < 0) {

			result2 = Math.pow(double2, 4);

			System.out.println("The result2 is : " + result2);

		} else {
			result2 = Math.pow(double2, 2);
			System.out.println("The result2 is : " + result2);
		}
		
		if (double3 < 0) {

			result3 = Math.pow(double3, 4);

			System.out.println("The result3 is : " + result3);

		} else {
			result3 = Math.pow(double3, 2);
			System.out.println("The result3 is : " + result3);
		}

	}
}