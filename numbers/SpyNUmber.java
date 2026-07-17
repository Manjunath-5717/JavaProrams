package com.numbers;

import java.util.Scanner;

//spy number means add and mul no should be same like 1+2+3=6 and 1*2*3=6
public class SpyNUmber {

	public static boolean spy(int num) {
		int sum=0;
		int pro=1;
		while(num!=0) {
			int digit=num%10;
			sum=sum+digit;
			pro=pro*digit;
			num=num/10;
		}
		return sum==pro;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
        System.out.println(spy(n));
	}
}
