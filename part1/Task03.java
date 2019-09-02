package jb29.unit3.part1;

import java.util.Random;

// 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».

public class Task03 {

	static final int NUMBER_TO_COMPARE = 3;

	public static void main(String[] args) {

		Random rand = new Random();

		int num1;

		num1 = rand.nextInt(10);

		if (num1 < NUMBER_TO_COMPARE) {

			System.out.println("yes");

		} else if (num1 > NUMBER_TO_COMPARE) {
			System.out.println("no");
		}

	}
}