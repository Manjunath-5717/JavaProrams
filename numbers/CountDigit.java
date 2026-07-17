package com.numbers;

import java.util.Scanner;

public class CountDigit {
	
	public static int count(int n) {
		if(n==0) {
			System.out.println("number cannot be  zero");
			System.exit(0);
		}
		
		int count=0;
		while(n!=0) {
		
			count++;
			n=n/10;
		
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a nuber");
		int n=sc.nextInt();
		System.out.println("no of counts digit "+count(n));
		
	}

}
	
	public static void main(String[] args) {
		int n=123;
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		System.out.println("conut of the no "+ count);
	}
}
