package com.test07dec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Student5  {
	int id;
	String nameString;
	String address;
	public Student5(int id, String nameString, String address) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.address = address;
	}

	public Student5() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ",    nameString=" + nameString +",    Address=" + address + "]";
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
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		}
		return 0;
	}
}
class SortAddress implements Comparator<Student5> {
	@Override
	public int compare(Student5 o1, Student5 o2) {
		return o1.address.compareTo(o2.address);
	}
}

class Student {

	public static void main(String[] args) {
		ArrayList<Student5> studentList = new ArrayList<>();

	        // Creating Student5 objects
	        Student5 student1 = new Student5(10, "Ram","Jaipur");
	        Student5 student2 = new Student5(20, "Ramesh","Alwar");
	        Student5 student3 = new Student5(10, "Preveen","Jodhpur");
	        Student5 student4 = new Student5(30, "Santosh", "Sirohi");
	        Student5 student5 = new Student5(60, "Jitendar","Jaipur");
	        Student5 student6 = new Student5(80, "Jitendar Kumar", "Sikar");
	        Student5 student7 = new Student5(100, "Rahul","PratapGarh");
	        Student5 student8 = new Student5(101, "Rahul","Sikar");

	        // Adding objects to the list
	        studentList.add(student1);
	        studentList.add(student2);
	        studentList.add(student3);
	        studentList.add(student4);
	        studentList.add(student5);
	        studentList.add(student6);
	        studentList.add(student7);
	        studentList.add(student8);
	        TreeSet<Student5> set = new TreeSet<Student5>(new SortingById());
	        set.addAll(studentList);
	        TreeSet<Student5> set1 = new TreeSet<Student5>(new StringSort());
	        set1.addAll(studentList);	
	        TreeSet<Student5> set2 = new TreeSet<Student5>(new SortAddress());
	        set2.addAll(studentList);		
	        while (true) {
	        System.out.println("Enter number 1 for Sorting By Id");
	        System.out.println("Enter number 2 for Sorting By Name");
	        System.out.println("Enter number 3 for Sorting By Address");
	        System.out.println("Enter number 4 for Reverse Sorting By Address");
	        System.out.println("Enter number 5 for Reverse Sorting Name");
	        System.out.println("Enter number 6 for Reverse Sorting Id");
	        Scanner s = new Scanner(System.in); 
				int key = s.nextInt();
				switch (key) {
				case 1: {
					set.forEach(System.out::println);
					break;
				}case 2:{					
					set1.forEach(System.out::println);
					break;
				}case 3:{										
					set2.forEach(System.out::println);
					break;
				}case 4:{	
					set2=(TreeSet<Student5>) set2.descendingSet();
					set2.forEach(System.out::println);
					break;
				}case 5:{	
					set1=(TreeSet<Student5>) set1.descendingSet();
					set1.forEach(System.out::println);
					break;
				}case 6: {
					set=(TreeSet<Student5>) set.descendingSet();
					set.forEach(System.out::println);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + key);
				
				}
				System.out.println("Again? (1 for Yes, 0 for No)");
	            int again = s.nextInt();
	            if (again == 0) {
	                break;
	            }
	        }  
	}
}
