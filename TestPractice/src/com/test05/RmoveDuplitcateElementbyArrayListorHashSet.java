package com.test05;

import java.util.ArrayList;
import java.util.HashSet;

public class RmoveDuplitcateElementbyArrayListorHashSet {
	

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		String inputStrings="JAVA J2EE JSP SERVLETS JAVA STRUTS JSP";
		String [] splitStrings=inputStrings.split(" ");
		for (String string : splitStrings) {
			list.add(string);
		}
		
		System.out.println(list);
		
		HashSet<String> set=new HashSet<String>(list);
		
		System.out.println(set);
	}
}
