package com.numbers;

import java.util.Scanner;

public class PrimeNumberss {
	
	public static void printPrimeNo(int n) {
		
	for(int j=2;j<=n;j++) {
		boolean isPrime=true;
		
		for(int i=2;i<=j/2;i++) {
			if(j%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println(j +" ");
		}
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
        printPrimeNo(n);
	}

}
