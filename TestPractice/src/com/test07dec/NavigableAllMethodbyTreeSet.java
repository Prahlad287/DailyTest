package com.test07dec;

import java.util.Set;
import java.util.TreeSet;

public class NavigableAllMethodbyTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		//add element
		set.add(1);
		set.add(0);
		set.add(3); 
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(6);
		//print all methods 
		System.out.println("Print TreeSet Element in Normal Order:"+set);
		System.out.println("Print TreeSet Element in Reverse Order:"+set.descendingSet());
		System.out.println("Print 3 Element from 3 :"+set.tailSet(3));
		System.out.println("Print lower(3) :"+set.lower(3));
		System.out.println("Print floor(3) :"+set.floor(3));
		System.out.println("Print higher(3) :"+set.higher(3));
		System.out.println("Print Ceiling(3) :"+set.ceiling(3));
		System.out.println("PollFirst :"+set.pollFirst());
		System.out.println("Print after pollFirst :"+set);
	}
}
