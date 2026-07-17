package com.numbers;
//single numbres using single statement

import java.util.Scanner;

public class SwapnoSingle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
        System.out.println("enter  b number");
        int b=sc.nextInt();
        
        a=(a+b)-(b=a); 
        //a=5 b=4   a+b=9 a=9
        //b=5
        //9-5 =a  a=4
        
        System.out.println("swapped a "+a);
        System.out.println("swapped b "+b);
		
	}

}
