package jb29.unit3.part1;

import java.util.Scanner;

// 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.

public class Task34 {

	public static void main(String[] args) {

		int price;
		int cash;

		price = enterFromConsole("book price");
		cash = enterFromConsole("cash");

		if (price == cash) {
			System.out.println("Thank you!");

		} else if (cash > price) {
			System.out.println("Please take your change: " + (cash - price));

		} else {
			System.out.println("Please add more cash: " + (price - cash));

		}
	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number;

		System.out.println("Enter " + message + ": ");

		while (!scanner.hasNextInt()) {
			scanner.next();

			System.out.println("Enter " + message + ": ");
		}
		number = scanner.nextInt();

		return number;

	}
}