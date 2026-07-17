package com.numbers;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void isPrime(int n) {
		if(n<2) {
			System.out.println(n + "it is not a prime number");
			return;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(n +" it is not a prime number");
				return;
			}
		}
		System.out.println(n + "it is a prime number ");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		isPrime(n);

	}
}
