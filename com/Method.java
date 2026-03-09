package com;

public class Method {
	int add(int a,int b) {
		return a+b;
	}
    int add(int a,int b,int c) {
    	return a+b+c;
    }
	public static void main(String[] args) {
	 
    Method  m1=new Method();
    
   
    System.out.println(m1.add(10,20));
    System.out.println(m1.add(10,20,30));
   
	}

}

