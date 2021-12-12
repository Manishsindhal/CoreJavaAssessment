package com.zensar.stringpro;

public class StringImmutableTest {

	public static void main(String[] args) {
		String str1 = "Manish";
		System.out.println("Print str1 with original value = " + str1);

		/*
		 * This is not working when modify this value like str1.concat("abc") because
		 * once String object is created its data or state can't be changed but a new
		 * String object is created that's why string literal is immutable .
		 */
		str1.concat("Sindhal"); // It's working like this --> str1 = str1.concat("Sindhal")
		System.out.println("Print str1 after concat = " + str1);

		// Create StringBuilder
		System.out.println("--------Print StringBuilder--------");
		StringBuilder sb = new StringBuilder("Ram");
		sb.append("Singh");// Now original string is changed that's why StringBuilder is mutable
		
		System.out.println("Print StringBuilder = " + sb);

	}
}
