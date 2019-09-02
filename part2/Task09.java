package jb29.unit3.part2;

// 9. Найти сумму квадратов первых ста чисел.

public class Task09 {

	public static void main(String[] args) {

		int numfrom = 1;
		int numTo = 100;
		int sum = 0;

		while (numfrom <= numTo) {

			sum = sum + numfrom * numfrom;
			numfrom++;
		}

		System.out.println("Sum is: " + sum);
	}

}
