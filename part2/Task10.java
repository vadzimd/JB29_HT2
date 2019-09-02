package jb29.unit3.part2;

import java.math.BigInteger;

// 10. Составить программу нахождения произведения квадратов первых двухсот чисел

public class Task10 {

	public static void main(String[] args) {

		int numfrom = 1;
		int numTo = 200;
		BigInteger mult = new BigInteger("1");

		while (numfrom <= numTo) {

			mult = mult.multiply(BigInteger.valueOf(numfrom)).multiply(BigInteger.valueOf(numfrom));
			numfrom++;
		}

		System.out.println("Mult is: " + mult);
	}

}
