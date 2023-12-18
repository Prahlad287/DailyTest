package com.anytime;

public class CallbyRefrence {
	static int number;
	 void increment() {
		number=number+1;
		System.out.println(number);
	}
	public static void main(String[] args) {
		CallbyRefrence cb1=new CallbyRefrence();
		// number=10;
		System.out.println(cb1.number);
		cb1.increment();
		System.out.println(cb1.number);

	}

}
