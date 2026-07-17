package com.numbers;

import java.util.Scanner;

public class Factors {
	
	public static void factor(int n) {
	
		for(int i=1;i<=n;i++) {//we can use i<n/2 it checks only
			if(n%i==0) {
				System.out.println(i);
			}
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
        factor(n);
	}

}
