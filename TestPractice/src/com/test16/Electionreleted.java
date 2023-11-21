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
		/*
		 * int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0; for (int i = 0; i < totalvote; i++) { if
		 * (total[i]==1) { a1++; }else if (total[i]==2) { a2++; }else if (total[i]==3) {
		 * a3++; } else if (total[i]==4) { a4++; } else if (total[i]==4) { a5++; } else
		 * { a6++; } }
		 */
		
		  int[] voteCounts = new int[6]; 
	        for (int i = 0; i < totalvote; i++) {
	            if (total[i] >= 1 && total[i] <= 5) {
	                voteCounts[total[i]]++;
	            } else {
	                voteCounts[5]++; // noto vote count
	            }
	        }
	        
	        int maxVotesIndex = 1;
	        for (int i = 2; i <= 5; i++) {
	            if (voteCounts[i] > voteCounts[maxVotesIndex]) {
	                maxVotesIndex = i;
	            }
	        }

	        System.out.println("Winner is: " + maxVotesIndex);
	        
	        boolean tie = false;
	        for (int i = 1; i <= 5; i++) {
	            if (i != maxVotesIndex && voteCounts[i] == voteCounts[maxVotesIndex] && voteCounts[maxVotesIndex] != 0) {
	                tie = true;
	                break;
	            }
	        }

	        if (tie) {
	            System.out.println("Election tie");
	        }
			/*
			 * System.out.println("Total vote for condidate 1 is = "+a1);
			 * System.out.println("Total vote for condidate 2 is = "+a2);
			 * System.out.println("Total vote for condidate 3 is = "+a3);
			 * System.out.println("Total vote for condidate 4 is = "+a4);
			 * System.out.println("Total vote for condidate 5 is = "+a5);
			 * System.out.println("Total vote for noto  = "+a6);
			 * 
			 * if (a1 > a2 && a1 > a3 && a1 > a4 && a1 > a5 && a1 > a6) {
			 * System.out.println("Winner is: 1"); } else if (a2 > a1 && a2 > a3 && a2 > a4
			 * && a2 > a5 && a2 > a6) { System.out.println("Winner is: 2"); } else if (a3 >
			 * a1 && a3 > a2 && a3 > a4 && a3 > a5 && a3 > a6) {
			 * System.out.println("Winner is: 3"); } else if (a4 > a1 && a4 > a2 && a4 > a3
			 * && a4 > a5 && a4 > a6) { System.out.println("Winner is: 4"); } else if (a5 >
			 * a1 && a5 > a2 && a5 > a3 && a5 > a4 && a5 > a6) {
			 * System.out.println("Winner is: 5"); } else if (a1 == a2 || a1 == a3 || a1 ==
			 * a4 || a1 == a5 || a1 == a6) { System.out.println("Election tie"); } else if
			 * (a2 == a3 || a2 == a4 || a2 == a5 || a2 == a6) {
			 * System.out.println("Election tie"); } else if (a3 == a4 || a3 == a5 || a3 ==
			 * a6) { System.out.println("Election tie"); } else if (a4 == a5 || a4 == a6 ||
			 * a5 == a6) { System.out.println("Election tie"); } else {
			 * System.out.println("Winner is: None"); }
			 */

	}

}
