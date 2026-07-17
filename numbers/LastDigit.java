package com.numbers;

import java.util.Scanner;

public class LastDigit {
	
	public static  int lastDig(int n) {
	 return n%10; //to get a last digit we use % symbol
	}
	public static int lastButSeconddig(int n) {
		return n%100;// it is used to get last 2 digit 
		
	}
	
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	System.out.println("last digit is: "+ lastDig(n));
	System.out.println("last but second digit "+ lastButSeconddig(n));
}
}
