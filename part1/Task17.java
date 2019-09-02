package jb29.unit3.part1;

import java.util.Random;

// 17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.

public class Task17 {

	public static void main(String[] args) {

		Random rand = new Random();

		int m;
		int n;

		m = rand.nextInt(10);
		n = rand.nextInt(10);

		System.out.println("Start: m = " + m + ", n = " + n);

		if (m == n) {

			m = 0;
			n = 0;
		} else if (m < n) {

			m = n;
		} else if (n < m) {

			n = m;

		}

		System.out.println("Result: m = " + m + ", n = " + n);

	}
}