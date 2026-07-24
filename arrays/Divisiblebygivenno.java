package arrays;
//print elements divisible by given number.
public class Divisiblebygivenno {

	
	public static void printDivisbleno(int a[],int divisor) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%divisor==0) {
				System.out.println(a[i] +" ");
			}
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {2,8,4,6,5,7};
		printDivisbleno(arr, 2);
	}
	
}
