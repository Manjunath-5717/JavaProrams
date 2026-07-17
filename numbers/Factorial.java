package com.numbers;

import java.util.Scanner;

public class Factorial {
	public static void factorila(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorail number is: "+ fact);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		factorila(n);
	}

}
