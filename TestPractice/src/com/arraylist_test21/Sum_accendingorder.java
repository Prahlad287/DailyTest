package com.arraylist_test21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Sum_accendingorder {

	public static void main(String[] args) {

//		Input: [-1, 0, 1, 2, -1, -1], targetSum = 0
//		Output: [[-1, 0, 1], [-1, -1, 2]]
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(-1);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(-1);
		list.add(-1);
		Collections.sort(list);
		
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {	
					for (int k = j+1; k < list.size(); k++) {
				if (list.get(i)+list.get(j)+list.get(k)==0) {
				System.out.println(list.get(i)+" "+list.get(j)+" "+list.get(k));
				
					
			}
		}break;
					
		}

	}
	}

}
