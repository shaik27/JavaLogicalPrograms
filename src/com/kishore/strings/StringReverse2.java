package com.kishore.strings;

import java.util.Scanner;

// Reverse String using toCharArray()

public class StringReverse2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();

		char[] c = string.toCharArray();
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.println(c[i]);
		}

	}
}
