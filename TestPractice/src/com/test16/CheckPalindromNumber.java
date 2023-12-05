package com.test16;

import java.util.Scanner;

public class CheckPalindromNumber {
	static boolean palindrom(int number) {
		int origanal=number;
		int result=0;
		while (number>0) {
			int mod=number%10;
			result=result*10+mod;
			number=number/10;
		}
		if (result==origanal) {
			System.out.println("This is palindrom number");
		}else {
			System.out.println("Not palindrom number");
		}
		return false;
	}
	static boolean checkStringPalindrom(String word) {	
		String palindrom="";
		
		for (int i = word.length()-1; i >=0; i--) {
			palindrom+=word.charAt(i);
			
		}
		if (!palindrom.equals(word)) {
			return false;
		}
		else {
			return true;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number for check palindrom");
		palindrom(scanner.nextInt());
		if (checkStringPalindrom("apa")) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
	}
}
