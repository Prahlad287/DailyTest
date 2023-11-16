package com.test.arr;

import java.util.Iterator;

public class Findrepet_missing_number {

	public static void main(String[] args) {
		int number[]= {1,2,5,1,2,6,5,3,2,9};
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (number[j]>number[i]) {
					int temp=number[j];
					number[j]=number[i];
					number[i]=temp;
				}
			}
		}
		System.out.println("Repet number is*************************************************");
		int repetnumber=Integer.MIN_VALUE;
		for (int i = 0; i < number.length-1; i++) {
			if (number[i]==number[i+1]&&number[i]!=repetnumber) {
				System.out.println("Repet number is ="+number[i]);
				repetnumber=number[i];
			}
		}
		
		System.out.println("Missing number print **********************************************");
		for (int i = 0; i < number.length-1; i++) {
			int diffrent=number[i+1]-number[i];
			if(diffrent>1) {
				for (int j = 1; j <diffrent; j++) {
					System.out.println("Missing number is = "+(number[i]+j));
				}
			}
		}
		
	}

}
