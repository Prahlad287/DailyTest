package com.test16;

import java.util.*;



class Employee{
	 int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (id);
	}
	@Override
	public boolean equals(Object obj) {
		Employee y=(Employee) obj;
		return true ;
	}
	 
}
 public class Emp {
	
	 
  
  public static void main(String [] args){
  
	  Employee e1=new Employee(10);
	  Employee e2=new Employee(20);
	  Employee e3=new Employee(30);
	  Employee e4=new Employee(20);
	  
	  HashSet set=new HashSet();
	  set.add(e1);
	  set.add(e2);
	  set.add(e3);
	  set.add(e4);
	  System.out.println(set);
	  
	  LinkedHashSet set1=new LinkedHashSet(set); 
	  set1.add(e1);
	  set1.add(e4);
	  set.add(e3);
	  set.add(10);
	  System.out.println("LinkedHashSet "+ set1); } }
 


