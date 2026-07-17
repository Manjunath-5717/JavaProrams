package com.numbers;

import java.util.Scanner;

public class PerfectNo {

	public static void isPerfect(int num) {
		int sum=0;
		int original=num;
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(original==sum) {
			System.out.println("it is a perfect no");
		}else {
			System.out.println("it is not a perfcet ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=sc.nextInt();
        isPerfect(n);
	}
	}


