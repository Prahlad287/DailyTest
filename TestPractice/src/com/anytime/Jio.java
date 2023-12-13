package com.anytime;

import java.util.ArrayList;
import java.util.LinkedList;

interface Sim{
	void call();
}
public class Jio implements Sim {
	@Override
	public void call() {
		System.out.println("call by Jio sim");
		
	}
	public static void main(String[] args) {
		Sim mSim=new Jio();
		mSim.call();
		Jio mSim1=new Jio();
		mSim1.call();
		ArrayList list=new ArrayList();
		

	}

	

}
