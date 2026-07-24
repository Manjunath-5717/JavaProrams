package arrays;

public class Reverse {
	
	public static void reverseArray(int a[]) {
		
		int start=0;
		int end=a.length-1;
		
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		reverseArray(arr);
	}

}
