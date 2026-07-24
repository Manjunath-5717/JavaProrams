package arrays;

public class SumEvenElement {
	
	public static int evenElement(int a[]) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum=sum+a[i];
			}
		}
		return sum;
	}
public static void main(String[] args) {
	int arr[]= {3,4,5,6,4,5,6};
	System.out.println(evenElement(arr));
}
}
