package com.arraylist_test21;

public class Employee {
	private int empId;
	private String empName;
	public Employee(int id, String name) {
		empId=id;
		empName=name;
	}
	@Override
	public String toString() {
		
		return "Emp Id = "+empId+ " Emp Name = "+empName;
	}

}
