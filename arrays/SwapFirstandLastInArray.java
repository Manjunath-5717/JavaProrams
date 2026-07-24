package arrays;

public class SwapFirstandLastInArray {
	
	public static void swapfirstandLast(int a[]) {
//		int temp=a[0];
//		a[0]=a[a.length-1];
//		a[a.length-1]=temp;
		
		
		a[0]=a[0]+a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]=a[0]-a[a.length-1];
		
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		swapfirstandLast(arr);
	}

}
