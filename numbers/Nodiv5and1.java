package com.numbers;

import java.util.Scanner;

public class Nodiv5and1 {
	
	public static boolean isdivisible(int n) {
		if(n%5==0 && n%11==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
        System.out.println(isdivisible(n));
	}
}
