package jb29.unit3.part2;

// 11. Составить программу нахождения разности кубов первых двухсот чисел

public class Task11 {

	public static void main(String[] args) {

		int numfrom = 1;
		int numTo = 200;
		int result = 0;

		while (numfrom <= numTo) {

			result = result - (int)(Math.pow(numfrom, 3));

			numfrom++;
		}

		System.out.println("The result is: " + result);
	}

}
