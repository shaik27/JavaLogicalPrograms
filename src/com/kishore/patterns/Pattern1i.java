package com.kishore.patterns;

// 54321
//  5432
//   543
//    54
//     5

public class Pattern1i {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
