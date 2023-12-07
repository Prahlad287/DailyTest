package com.test05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringAlfhabetic {

	static String Alphabatic(String word) {
		word = word.toLowerCase();
		char[] ch = word.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}

	static void wordCount(String Input) {
		int count = 1;
		String[] splitStrings = Input.split(" ");
		for (int i = 0; i < splitStrings.length; i++) {
			if (splitStrings[i] != "") {
			for (int j = i + 1; j < splitStrings.length; j++) {
				
					if (splitStrings[i].equals(splitStrings[j])) {
						count++;
						splitStrings[j] = "";
					}
				}
			if (count>1) {
				System.out.println("Frequency of '" + splitStrings[i] + "': " + count);
			}
			count = 1;
			}
		}
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
		 wordCount( Input);
		String split[] = Input.split(" ");
		List<String> myList = Arrays.asList(split);
		Set<String> set = new HashSet<String>();
		for (String string : split) {
			String input = string;
			if (!set.contains(input)) {
				int frequency = Collections.frequency(myList, input);
				if (frequency>1) {
				System.out.println("Frequency of '" + input + "': " + frequency);
				}
				set.add(input);
			}
		}
	}
}
