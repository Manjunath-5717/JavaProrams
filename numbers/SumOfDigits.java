package com.numbers;

import java.util.Scanner;

//the sum of(Squares of digits) of a number
public class SumOfDigits {
	
	public static int sumofDigits(int n) {
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit*digit;
			n=n/10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int n=sc.nextInt();
    System.out.println(sumofDigits(n));
	}

}
