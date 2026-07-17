package com.numbers;

import java.util.Scanner;

public class NaturalNumbers {
	
	public static void naturalNumber(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		
		naturalNumber(n);

	}

}
