package com.arraylist_test21;

import java.util.ArrayList;

public class Duplicate_Remove {

	public static void main(String[] args) {


		//Input: [1, 2, 3, 2, 4, 5, 6, 4, 7]
				
		//Output: [1, 2, 3, 4, 5, 6, 7]
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(4);
		list.add(7);
		list.add(2);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(i)==list.get(j)) {
					System.out.println(list.remove(j));
				}
			}
		}
		System.out.println(list);

	}

}
