package com.test05;

public class StringCapitalize {

	public static void main(String[] args) {
		String input="prahlad";
		char [] inp=input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			int ch=inp[i];
			if (ch>91) {
				ch=ch-32;
				char c=(char) ch;
				System.out.print(c);	
			}
		}
		System.out.println("*******");
		int number=65;
		
		char c= (char) number;
		System.out.println(String.valueOf(c));
		System.out.println(c);
		
	}
}
