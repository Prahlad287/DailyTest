package com.test11dec;

import java.util.Comparator;
import java.util.TreeSet;

class Student{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int Id() {
		return id;
	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class StudentComparator {

	public static void main(String[] args) {
		Student s1=new Student(287,"Prahlad");
//		s1.setId(287);
//		s1.setName("Prahlad");
		Student s2=new Student(400,"Hello");
//		s2.setId(400);
//		s2.setName("May");
		Comparator comparator=Comparator.comparing(Student::Id);
		TreeSet set=new TreeSet(comparator.reversed());
		set.add(s1);
		set.add(s2);
		System.out.println(set);
		

	}

}
