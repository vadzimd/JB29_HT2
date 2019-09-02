package jb29.unit3.part1;

import java.util.Random;

// 16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).

public class Task16 {

	public static void main(String[] args) {

		Random rand = new Random();

		int x;
		int y;

		x = rand.nextInt(100) * -1;
		y = rand.nextInt(100);

		if (x == 0) {

			System.out.println("A is on X");

		} else if (y == 0) {

			System.out.println("A is on Y");
		}

		else if (x > 0 && y > 0) {

			System.out.println("A is in 1");
		}

		else if (x < 0 && y > 0) {

			System.out.println("A is in 2");
		}

		else if (x < 0 && y < 0) {

			System.out.println("A is in 3");
		}

		else if (x > 0 && y < 0) {

			System.out.println("A is in 4");
		}

	}
}
