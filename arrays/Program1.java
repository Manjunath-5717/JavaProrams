package arrays;

import java.util.Scanner;

public class Program1 {
	
	public static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] +" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		

		printArray(arr);
		
	}

}
