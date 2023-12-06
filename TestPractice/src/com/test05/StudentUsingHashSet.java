package com.test05;

public class StudentUsingHashSet {
	int rollNo;
	String name;
	String departmentString;

	public StudentUsingHashSet(int rollNo, String name, String departmentString) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.departmentString = departmentString;
	}

	@Override
	public String toString() {
		return "StudentUsingHashSet [rollNo=" + rollNo + ", name=" + name + ", departmentString=" + departmentString
				+ "]";
	}

	@Override
	public int hashCode() {

		return rollNo;
	}

	@Override
	public boolean equals(Object obj) {

		return true;
	}
}
