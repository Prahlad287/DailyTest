package com.test16;

import java.util.Scanner;

public class Electionreleted {

	public static void main(String[] args) {
		System.out.println("vote for =1/2/3/4/5");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total vote=");
		int totalvote=scanner.nextInt();
		int total[]=new int[totalvote];
		for (int i = 0; i < totalvote; i++) {
			 total[i]=scanner.nextInt();
		}		
		int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0;
		for (int i = 0; i < totalvote; i++) {
			 if (total[i]==1) {
				 a1++;
			}else if (total[i]==2) {
				a2++;
			}else if (total[i]==3) {
				a3++;
			}
			else if (total[i]==4) {
					a4++;
			}
			else if (total[i]==4) {
				a5++;
			}
			else {
				a6++;
			}
		}	
		
		System.out.println("Total vote for condidate 1 is = "+a1);
		System.out.println("Total vote for condidate 2 is = "+a2);
		System.out.println("Total vote for condidate 3 is = "+a3);
		System.out.println("Total vote for condidate 4 is = "+a4);
		System.out.println("Total vote for condidate 5 is = "+a5);
		System.out.println("Total vote for noto  = "+a6);

	}

}
