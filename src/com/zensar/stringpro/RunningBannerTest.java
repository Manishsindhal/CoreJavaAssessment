package com.zensar.stringpro;

public class RunningBannerTest {

	public static void main(String[] args) {

		char[] ch = { 'W', 'e', 'l', 'c', 'o', 'm', 'e', ' ', 't', 'o', ' ', 'J', 'a', 'v', 'a' };

		StringBuilder sb = new StringBuilder();

		sb.append("\r[");
		
		for (int i = 0; i < ch.length; i++) {
			sb.append(ch[i]);
		}

		sb.append("]");
		System.out.print("Print StringBuilder = " + sb);
	}
}
