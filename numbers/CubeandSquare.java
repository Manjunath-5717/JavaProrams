package com.numbers;

import java.util.Scanner;

public class CubeandSquare {
	
	public static int square(int n) {
		return n*n;
	}
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a number: ");
		int n=sc.nextInt();
        System.out.println(square(n));
        System.out.println(cube(n));
		
	}
}
