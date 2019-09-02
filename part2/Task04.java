package jb29.unit3.part2;

// 4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.

public class Task04 {

	public static void main(String[] args) {

		int count = 2;

		while (count <= 100) {
			if (count % 2 == 0) {
				System.out.println("Even number: " + count);
			}
			count++;
		}
	}

}
