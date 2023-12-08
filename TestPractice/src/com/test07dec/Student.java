package com.test07dec;

import java.util.Comparator;
import java.util.TreeSet;

class Student5 {
	int id;
	String nameString;
	public Student5(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}

	public Student5() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + "]";
	}
}

class StringSort implements Comparator<Student5> {
	@Override
	public int compare(Student5 o1, Student5 o2) {
		return o1.nameString.compareTo(o2.nameString);
	}
}

class SortingById implements Comparator<Student5> {

	public int compare(Student5 o1, Student5 o2) {
		if (o1.id > o2.id) {
			return -1;
		} else if (o1.id < o2.id) {
			return 1;
		}
		return 0;
	}
}

class Student {

	public static void main(String[] args) {
		Student5 student = new Student5(10, "Ram");
		Student5 student2 = new Student5(20, "Ramesh");
		Student5 student3 = new Student5(10, "Preveen");
		Student5 student4 = new Student5(30, "Santosh");
		Student5 student5 = new Student5(60, "Jitendar");
		Student5 student6 = new Student5(80, "Jitendarit");
		Student5 student7 = new Student5(100, "Rahul");
		Student5 student8 = new Student5(101, "Rahul");

		TreeSet<Student5> set = new TreeSet<Student5>(new SortingById());
		set.add(student);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		set.add(student5);
		set.add(student6);
		set.add(student7);
		set.add(student8);
		set.forEach(System.out::println);
		System.out.println("************************************************");

		TreeSet<Student5> set1 = new TreeSet<Student5>(new StringSort());
		set1.add(student);
		set1.add(student2);
		set1.add(student3);
		set1.add(student4);
		set1.add(student5);
		set1.add(student6);
		set1.add(student7);
		set1.add(student8);
		
		set1.forEach(System.out::println);
	}
}
