package com.numbers;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int reverseno(int num) {
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    System.out.println(reverseno(n));
}
}
