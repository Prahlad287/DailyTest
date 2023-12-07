package com.test07dec;

import java.util.TreeSet;

public class NavigableSetinTreesSet {

	public static void main(String[] args) {

		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(10);
		System.out.println(set);
		set.add(100);
		set.add(50);
		
		System.out.println("Print First Element :"+set.first());
		System.out.println("Print Last Element :"+set.last());
		System.out.println("Remove First element :"+set.pollFirst());
		System.out.println("After Remove First element :"+set);
		System.out.println("Remove Last element :"+set.pollLast());
		System.out.println("After Remove Last element :"+set);

	}

}
