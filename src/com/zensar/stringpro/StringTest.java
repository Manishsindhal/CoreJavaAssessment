package com.zensar.stringpro;

public class StringTest {
	public static void main(String[] args) {
		
		String str1 = "ABC";
		String str2 = new String("ABC");
		
		//It check the reference and str2 refers to instance created in non constant pool
		if(str1 == str2)
			System.out.println("string are equal");
		
		//It compare the string
		if(str1.equals(str2))
			System.out.println("string are too equal");
		
		str1 = "abc"; // This is not working when modify this value like str1.concat("abc") that's why string literal is immutable
		String str3 = "ABC";
		System.out.println("Print str1 = " + str1.hashCode()); //point to different memory location because create different object in pool 
		System.out.println("Print str3 = " + str3.hashCode()); //point to same memory location as previous
		System.out.println("Print str2 = " + str2.hashCode()); //point to same memory location as previous in non pool area
	}
}
