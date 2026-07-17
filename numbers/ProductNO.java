package com.numbers;

import java.util.Scanner;

public class ProductNO {
			
		public static void sum(int n) {
			int pro=1;
			for(int i=1;i<=n;i++) {
				pro=pro*i;  //1*1=1 1*2=2 2*3=6 6*4=24 24*5=
			}
			System.out.println("sum of no "+ pro);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int n=sc.nextInt();
			sum(n);
		

	}


}
