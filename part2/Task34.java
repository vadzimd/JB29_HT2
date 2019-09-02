package jb29.unit3.part2;

// 34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.

public class Task34 {

	public static void main(String[] args) {

		int sum = 0;
		int numCheck;

		for (int num = 1000; num < 10000; num++) {

			sum = 0;
			numCheck = num;

			while (!(numCheck % 10 == 0 && numCheck < 10)) {

				sum = sum + numCheck % 10;
				numCheck = numCheck / 10;
			}

			if (sum == 15) {
				System.out.println("The number is: " + num);
			}
		}

	}
}
