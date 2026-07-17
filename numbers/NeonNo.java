package com.numbers;

import java.util.Scanner;

public class NeonNo {
	
	public static boolean isNeon(int num) {
		int square=num*num;
		int sumofDigits=0;
		while(square!=0) {
			sumofDigits=sumofDigits+square%10;
			square=square/10;
		}
		return sumofDigits==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
        System.out.println(isNeon(n));
	}

}
