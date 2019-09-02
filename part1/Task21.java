package jb29.unit3.part1;

import java.util.Scanner;

// 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».

public class Task21 {

	public static void main(String[] args) {

		Scanner scanner;
		String cat = "cat";
		String dog = "dog";

		scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the word 'cat' or 'dog': >");

			String answerEntered = scanner.nextLine(); // Read user input

			System.out.println("Entered: " + answerEntered);

			if (answerEntered.equalsIgnoreCase(cat)) {
				System.out.println("I like cats");
			} else if (answerEntered.equalsIgnoreCase(dog)) {
				System.out.println("I like dogs");
			} else {
				System.out.println("You didn't enter the right variant");

			}
		} finally {
			scanner.close();
		}

	}
}