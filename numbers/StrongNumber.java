package com.numbers;
//check whether a number is strong/factorial/krishnamurty number

import java.util.Scanner;

public class StrongNumber {
	
	public static void  strongNo(int n) {
		int sum=0;
		int original=n;
		
		while(n!=0) {
			int digit=n%10;

			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==original) {
			System.out.println("it is strong number :");
		}else {
			System.out.println("it is not a strong number");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		strongNo(n);
        
	}
	
	
}
