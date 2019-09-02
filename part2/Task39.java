package jb29.unit3.part2;

// 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. Найти это число.

public class Task39 {

	public static void main(String[] args) {

		int digit1;
		int digit2;
		int digit;

		for (int A = 100; A < 1000; A++) {

			digit1 = A % 10;
			digit2 = (A / 10) % 10;

			digit = digit2 * 10 + digit1;

			if (digit * 7 == A) {
				System.out.println("The number A is " + A);
			}

		}

	}

}
