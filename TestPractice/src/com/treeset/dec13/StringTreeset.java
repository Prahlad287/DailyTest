package com.treeset.dec13;

import java.util.Comparator;
import java.util.TreeSet;

class StringBufferSorting implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		StringBuffer s1=(StringBuffer) o1;
		StringBuffer s2=(StringBuffer) o2;
		return s1.compareTo(s2);
	}
	
}
class SortingString implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		return s1.compareTo(s2);
	}
	
}
class SortingStringorBuffer implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
//		if (o1.toString().length()>o2.toString().length()) {
//			return o2.toString().compareTo(o1.toString());
//		}else {
//			return o1.toString().compareTo(o2.toString());
//		}
		if (o1.toString().length()>o2.toString().length()) {
					return 1;
		}else if (o1.toString().length()<o2.toString().length()) {
			return -1;
		}else {
			return o1.toString().compareTo(o2.toString());
		} 
		
	}
}

public class StringTreeset {

	public static void main(String[] args) {
		
		TreeSet set=new TreeSet(new SortingString().reversed());
		set.add("Prahlad");
		set.add("Avinash");
		set.add("Chandan");
		System.out.println(set);
		
		
		TreeSet set1=new TreeSet(new StringBufferSorting().reversed());
		set1.add(new StringBuffer("A"));
		set1.add(new StringBuffer("Z"));
		set1.add(new StringBuffer("K"));
		set1.add(new StringBuffer("L"));
		
		System.out.println(set1);
		
		TreeSet set2=new TreeSet(new SortingStringorBuffer());
		set2.add("A");
		set2.add(new StringBuffer("ABC"));
		set2.add(new StringBuffer("AA"));
		set2.add(new StringBuffer("CD"));
		set2.add("RBCD");
		
		System.out.println(set2);
	}
}
