package jb29.unit3.part2;

// 37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49.

public class Task37 {

	public static void main(String[] args) {

		int numAB;
		int numBA;

		for (int A = 10; A < 100; A++) {

			for (int B = 10; B < 100; B++) {

				numAB = A * 100 + B;
				numBA = B * 100 + A;

				if (numAB % 99 == 0 && numBA % 49 == 0) {
					System.out.println("The number A is " + A + ", number B is " + B);
				}

			}

		}

	}
}
