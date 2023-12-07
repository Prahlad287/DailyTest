package com.test07dec;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSynchronizeExample {
	

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(70);
		
		System.out.println(list);
		synchronized (list) {
			System.out.println(list);
		}
		Collections.synchronizedCollection(list);
		
	}
}
