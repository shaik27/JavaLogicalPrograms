package com.kishore.strings;

public class StringEqualtoOperator {
	public static void main(String[] args) {

		String str1 = "kishore";
		String str2 = "kishore";
		String str3 = "krish";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		// Based on Memory Address
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		String str4 = new String("kishore");
		String str5 = new String("kishore");
		String str6 = new String("krish");

		System.out.println(str4.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
		// Based on Memory Address
		System.out.println(str4 == str5);
		System.out.println(str4 == str6);

		StringBuffer str7 = new StringBuffer("kishore");
		StringBuffer str8 = new StringBuffer("kishore");
		StringBuffer str9 = new StringBuffer("krish");

		System.out.println(str7.hashCode());
		System.out.println(str8.hashCode());
		System.out.println(str9.hashCode());
		System.out.println(System.identityHashCode(str7));
		System.out.println(System.identityHashCode(str8));
		System.out.println(System.identityHashCode(str9));
		// Based on Memory Address
		System.out.println(str7 == str8);
		System.out.println(str7 == str9);

	}
}
