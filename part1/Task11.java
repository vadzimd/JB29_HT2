package jb29.unit3.part1;

import java.util.Random;

// 11. Составить программу, которая определит площадь какого треугольника больше.

public class Task11 {

	public static void main(String[] args) {

		Random rand = new Random();

		int a1;
		int b1;
		int c1;
		double p1;
		int a2;
		int b2;
		int c2;
		double p2;

		double triangleSquare1;
		double triangleSquare2;

		a1 = rand.nextInt(10);
		b1 = rand.nextInt(10);
		c1 = rand.nextInt(10);
		
		a2 = rand.nextInt(10);
		b2 = rand.nextInt(10);
		c2 = rand.nextInt(10);
		
		p1 = (a1+b1+c1)/2;
		p2 = (a2+b2+c2)/2;

		triangleSquare1 = Math.sqrt(p1*(p1-a1)*(p1-b1)*(p1-c1));
		triangleSquare2 = Math.sqrt(p2*(p2-a2)*(p2-b2)*(p2-c2));

		if (Double.compare(triangleSquare1, triangleSquare2) == 0) {

			System.out.println("Both triangles have the same square");
		} else if (Double.compare(triangleSquare1, triangleSquare2) < 0) {

			System.out.println("The smallest square is " + triangleSquare1);
		} else {

			System.out.println("The smallest square is " + triangleSquare2);
		}

	}
}