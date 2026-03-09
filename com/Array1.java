package com;
import java.util.Scanner;

public class Array1 {
	
	

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		
		int[] a=new int[4];
		System.out.println("Enter the elememts to be stored in the array:");
		for(int i=0;i<4;i++) {
			a[i]=Sc.nextInt();
		}
		
    for(int i=0;i<4;i++) {
    	System.out.println(a[i]);
    }
	}

}
