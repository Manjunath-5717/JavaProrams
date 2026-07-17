package com.numbers;

import java.util.Scanner;

public class NaturalSum {
	
	public static void sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of no "+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		sum(n);
	}

}
