package jb29.unit3.part2;

// 5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.

public class Task05 {

	public static void main(String[] args) {

		int count = 1;
		int sumOdd = 0;

		while (count <= 99) {
			if (count % 2 != 0) {
				sumOdd = sumOdd + count;
			}
			count++;
		}

		System.out.println("Sum of odd number is: " + sumOdd);
	}

}
