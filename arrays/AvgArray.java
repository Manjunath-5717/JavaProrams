package arrays;

public class AvgArray {
	
	public static void avgofElements(int a[]) {
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("average of elements in array is:" +sum/a.length);
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		avgofElements(a);
	}

}
