package com.test07dec;

import java.util.TreeSet;

public class NavigationSetObjectExample {
	static void ExampleNavigableSet() {
		TreeSet set=new TreeSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("E");
		set.add("D");
		System.out.println("Initial Set: "+set);
		System.out.println("Reverse Set: "+set.descendingSet());
		System.out.println("Head Set: "+set.headSet("D"));
		System.out.println("Sub Set: "+set.subSet("B", "F"));
		System.out.println("Tail Set: "+set.tailSet("D"));
	}
	static void Second() {
		TreeSet set=new TreeSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("E");
		set.add("D");
		System.out.println("Initial Set: "+set);
		System.out.println("Head Set: "+set.headSet("C"));
		System.out.println("Sub Set: "+set.subSet("A", "E"));
		System.out.println("Tail Set: "+set.tailSet("C"));
	}

	public static void main(String[] args) {
		ExampleNavigableSet();
		System.out.println("*******************Second question******************");
		Second();
		

	}

}
