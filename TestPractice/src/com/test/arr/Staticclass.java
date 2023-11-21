package com.test.arr;
class Static2{
	static void show(){
		System.out.println("this is show method in static2");
	}
}
public class Staticclass extends Static2 {
	
	static void show(){
		
		System.out.println("this is show method in staticclass");
	}
	public static void main(String[] args) {
		Staticclass staticclass=new Staticclass();
		staticclass.show();
		Static2.show();

	}

}
