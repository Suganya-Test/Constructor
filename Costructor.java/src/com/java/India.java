package com.java;

public class India {

	public India() {
		
		System.out.println("Non Parameterized");
	}
	
public India(String s) {
		
		System.out.println("Its"+s);
	}
	public static void main(String[] args) {
		
		India i=new India("Parameterized");
		India c=new India();
	}

}
