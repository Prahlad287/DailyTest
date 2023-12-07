package com.test07dec;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetSynchronizeExample {

	public static void main(String[] args) {

		HashSet set=new HashSet();
		set.add(20);
		set.add(50);
		set.add(80);
		System.out.println(set);
		Collections.synchronizedCollection(set);
		
		
		synchronized (set) {
			Iterator itr=set.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			itr.forEachRemaining(System.out::println);
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
	}
}
