package com;

public class Methodo {
	
	 static void add(int a,int b) {
		 System.out.println(a+b);
	 }
	 static void add(int a,int b,int c) {
		 System.out.println(a+b+c);
	 } 
	 static void add(int a, int b, int c,int d) {
		 System.out.println(a+b+c+d);
	 }
	  

	public static void main(String[] args) {
	
		add(2,3);
		add(5,5,3);
		add(10,20,30,40);
 
	}

}
