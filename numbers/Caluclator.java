package com.numbers;

import java.util.Scanner;

public class Caluclator {
	
	public static void add(int a,int b) {
		System.out.println("Addition "+(a+b));
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static void mul(int a,int b) {
		System.out.println("Multiplication "+(a*b));
	}
	public static void div(int a,int b) {
	System.out.println("Division "+(a/b));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number1: ");
		int n1=sc.nextInt();
        System.out.println("enter a number2: ");
        int n2=sc.nextInt();
        
     add(n1,n2);
     System.out.println("substraction "+ sub(n1,n2));
     mul(n1,n2);
     div(n1,n2);
		
	}
}
