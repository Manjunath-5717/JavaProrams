package com.numbers;

import java.util.Scanner;

public class AlternativeNodigits {
	
	public static int alternative(int num) {
		int sum=0;
		while(num!=0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println("alternative digitd of a number is "+alternative(n));
  
	}

}
