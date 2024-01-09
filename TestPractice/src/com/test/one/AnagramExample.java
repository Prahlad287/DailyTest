package com.test.one;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramExample {

	public static void main(String[] args) {
		//  "listen", "silent", "enlist", "hello", "world", "helloworld"
		String []arr= { "listen", "silent", "enlist", "hello", "world", "helloworld"};
		 char []c;
		 char []c2;
		 // Sort String Array 
		for (int i = 0; i < arr.length; i++) {
			 c=arr[i].toCharArray();
			 Arrays.sort(c);
			 arr[i]=String.valueOf(c);

		}
		//Add array in ArrayList by forEach loop
		ArrayList list=new ArrayList();
		for (String d : arr) {
			list.add(d);
		}
		// Find Anagram by loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println("Anagarm");
				}else {
					
					arr[j]="";
				}
			}
		}
		System.out.println();
		// Print Anagram words
		for (String d : arr) {
			System.out.println(d);
		}
			 
		
		//Find Anagram by Arraylist and Remove word not Anagram
		int size=list.size();
		for (int i = 0; i <size; i++) {
			for (int j = i+1; j < size; j++) {
				 if (list.get(i).equals(list.get(j))) {
	                    System.out.println("Anagram: " + arr[i] + " and " + arr[j]);
	                    break;
	                }
				 else {
					
					list.remove(j);
					size--;
					j--;
				}
			}
		}
		System.out.println(list);

	}

}
