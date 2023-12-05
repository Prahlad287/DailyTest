package com.test16;

class One{}
public class All {
	static One one;
	public static void main(String[] args) {
//		int i=0;
//		if(i==0) 
			System.out.println(true);
		
//		else 
//			System.out.println(false);
		
		Long l=(long) 20;
		System.out.println(l instanceof Object);
		System.out.println(one instanceof One);
		double f[]= {1.2f,3.0f,2.0};
		System.out.println(f instanceof Object);
		
		
		
	        String A="madam";
	        
	        StringBuffer sb=new StringBuffer();
	        for(int i=A.length()-1;i>=0;i--){
	            sb.append(A.charAt(i));
	            
	        }
	        String origanl=sb.toString();
	        
	        System.out.println(origanl);
	        if(A.equals(origanl)){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	}

}
