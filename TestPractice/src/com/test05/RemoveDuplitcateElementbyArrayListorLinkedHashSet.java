package com.test05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplitcateElementbyArrayListorLinkedHashSet {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		String inputStrings="JAVA J2EE JSP SERVLETS JAVA STRUTS JSP";
		String [] splitStrings=inputStrings.split(" ");
		for (String string : splitStrings) {
			list.add(string);
		}
		
		System.out.println(list);
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.addAll(list);
		System.out.println(set);
	}

}
