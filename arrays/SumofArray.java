package arrays;
//find the sum of all elements 

public class SumofArray {
	
			public static void printArray(int a[]) {
				int sum=0;
				for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
				}
				System.out.println(sum);
			}
			public static void main(String[] args) {
				int arr[]= {10,20,30,40,50,60};
				printArray(arr);
			}
		}




