package com.arraylist_test21;

import java.util.ArrayList;

public class ArrayList_student {

	public static void main(String[] args) {
		Employee e1=new Employee(287, "Prahlad");
		Employee e2=new Employee(295, "Avinash");
		Employee e3=new Employee(300, "Meghraj");
		Employee1 e4=new Employee1(200, "Ram");
		int id=e4.getId();
		System.out.println(id);
		String nameString=e4.getName();
		System.out.println(nameString);
		ArrayList list2=new ArrayList();
		
		list2.add(id);
		list2.add(nameString);
		ArrayList<Employee> list=new ArrayList<Employee>(list2);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
//		list.forEach(System.out::println);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
