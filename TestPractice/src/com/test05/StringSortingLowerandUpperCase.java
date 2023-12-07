package com.test05;

public class StringSortingLowerandUpperCase {

	public static void main(String[] args) {
		String word="Prahlad";
		char temp;
		int changeI,changeJ;
		char [] charword=word.toCharArray();
		
		for (int i = 0; i < charword.length; i++) {
			changeI=charword[i];
			System.out.println(changeI);
			if (changeI<91) { // small
				changeI=changeI+32; //small+32
			}
			for (int j =i+1; j < charword.length; j++) {
				changeJ=charword[j];
				if (changeJ<91) {
					changeJ=changeJ+32; //small +32
				}
				if (changeI>changeJ) {
					temp=charword[i];
					charword[i]=charword[j];
					charword[j]=temp;
				}
			}
		}
		System.out.println(charword);

	}
}
