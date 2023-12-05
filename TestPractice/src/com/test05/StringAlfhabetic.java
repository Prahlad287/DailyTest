package com.test05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringAlfhabetic {

	static String Alphabatic(String word) {
		word = word.toLowerCase();
		char[] ch = word.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

	static int wordCount(String target, String Input) {
		int count = 0;
		String[] splitStrings = Input.split("\\s");
		for (String string : splitStrings) {

			if (string.equals(target)) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String for alphabatic");
		// String result=Alphabatic(sc.next());
		// System.out.println(result);

		String Input = "exploring the narrow alleyways and"
				+ "hidden corners of the village, often discovering hidden treasures"
				+ "and forgotten relics. One day, while ambling through the cobblestone streets, "
				+ "Whiskers stumbled upon a mysterious door tucked away behind a " + "cluster of vibrant flowers the";

		// wordCount(target, Input);
		int count = 1;
		String[] splitStrings = Input.split("\\s");
		for (int i = 0; i < splitStrings.length; i++) {
			if (splitStrings[i] != "") {
				//System.out.println(splitStrings[i]);
			for (int j = i + 1; j < splitStrings.length; j++) {
				
					if (splitStrings[i].equals(splitStrings[j])) {
						count++;
						splitStrings[j] = "";
					}
				}
			System.out.println(splitStrings[i] + " " + count);
			count = 1;
			}
		}
	}
}
