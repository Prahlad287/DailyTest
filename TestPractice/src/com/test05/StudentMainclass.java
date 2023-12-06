package com.test05;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StudentMainclass {

	public static void main(String[] args) {
		StudentUsingHashSet sh = new StudentUsingHashSet(122, "Prahlad", "Java");
		StudentUsingHashSet sh1 = new StudentUsingHashSet(295, "Ajay", "Cyber");
		StudentUsingHashSet sh2 = new StudentUsingHashSet(122, "Avinash", "Java");
		StudentUsingHashSet sh3 = new StudentUsingHashSet(130, "Meghraj", "Java");
		// remove duplicate element by HashSet class
		HashSet<StudentUsingHashSet> set = new HashSet<StudentUsingHashSet>();
		set.add(sh);
		set.add(sh1);
		set.add(sh2);
		set.add(sh3);
		// print by forEach loop lambda expression
		set.forEach(System.out::println);

		System.out.println("************LinkedHashSet***************");
		// remove duplicate element by LinkedHashSet class
		LinkedHashSet<StudentUsingHashSet> st = new LinkedHashSet<StudentUsingHashSet>();
		st.add(sh);
		st.add(sh3);
		st.add(sh2);
		st.add(sh1);
		st.forEach(System.out::println);
	}
}
