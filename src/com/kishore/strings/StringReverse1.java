package com.kishore.strings;

import java.util.Scanner;

// Reverse String using charAt()

public class StringReverse1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();

		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.println(string.charAt(i));
		}
	}
}
