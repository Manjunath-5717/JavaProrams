package com;
import java.util.Scanner;


public class Arrayinp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int[] a=new int[sc.nextInt()];
	System.out.println(a.length);
	
	System.out.println("enter elements to be stored in the array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	}

}
