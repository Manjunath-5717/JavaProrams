package com.numbers;

import java.util.Scanner;

public class SumDigits {
	
	public static int sumDigits(int n) {
		if(n==0) {
			System.out.println("number cannot be zero");
			System.exit(0);
		}
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numer");
		int n=sc.nextInt();
		System.out.println(sumDigits(n));
	}

}
