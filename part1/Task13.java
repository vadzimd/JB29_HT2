package jb29.unit3.part1;

import java.util.Random;

// 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

public class Task13 {

	public static void main(String[] args) {

		Random rand = new Random();

		double x1;
		double y1;
		double x2;
		double y2;

		double dist1;
		double dist2;

		x1 = rand.nextDouble();
		y1 = rand.nextDouble();
		x2 = rand.nextDouble();
		y2 = rand.nextDouble();

		dist1 = Math.sqrt(x1 * x1 + y1 * y1);
		dist2 = Math.sqrt(x2 * x2 + y2 * y2);

		if (Double.compare(dist1, dist2) == 0) {

			System.out.println("Both points have the same distance");
		} else if (Double.compare(dist1, dist2) < 0) {

			System.out.println("The closest is (" + x1 + ", "+ y1 + ")");
		} else {

			System.out.println("The closest is ("  + x1 + ", "+ y1 + ")");
		}

	}
}