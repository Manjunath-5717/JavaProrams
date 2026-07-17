package com.numbers;

import java.util.Scanner;

public class SwapNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a number1");
    int  a=sc.nextInt();
    System.out.println("enter a numbre 2");
    int b=sc.nextInt();
    
    
    a=a+b; //5+6=11
    b=a-b; //11-6=5
    a=a-b; //11-5=6
    System.out.println("swapped a "+ a);
    System.out.println("swapped b "+ b);
}
}
