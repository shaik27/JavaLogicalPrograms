package com.kishore.patterns;

// 12345
// 1234
// 123
// 12
// 1

public class Pattern1e {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
