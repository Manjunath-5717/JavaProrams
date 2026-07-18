package arrays;

public class SumofEven {
	public static int sumofEven(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum=sum+a[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,3,4,5,6};
		System.out.println(sumofEven(arr));
	}

}
