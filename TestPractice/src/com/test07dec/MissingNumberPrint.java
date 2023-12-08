package com.test07dec;

import java.util.Arrays;
import java.util.Iterator;

public class MissingNumberPrint {

	public static void main(String[] args) {
		int arr[]= {3,7,1,2,8,4,5,55};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		for (int i = 0; i < arr.length-1; i++) {
			int diff=arr[i+1]-arr[i];
						if (diff>1) {
				for (int j = 1; j < diff; j++) {
					System.out.println(arr[i]+j);
				}
			}
			
		}
	}
}
