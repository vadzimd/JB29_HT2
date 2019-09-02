package jb29.unit3.part2;

// 36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. Найти эти числа.

public class Task36 {

	public static void main(String[] args) {

		int numEnd;
		int numBegin;

		for (int num = 1000; num < 10000; num++) {

			numEnd = num % 100;

			numBegin = num / 100;
			
			if ((numEnd * numBegin) > 0) {
				if (num % (numEnd * numBegin) == 0) {

					System.out.println("The number is  " + num);

				}
			}

		}

	}
}
