package arrays;

public class MaximumElemnet {
	
	public static int maxElment(int a[]) {
		
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
public static void main(String[] args) {
	int arr[]= {5,6,8,10,14,13,12,59,12};
	System.out.println(maxElment(arr));
}
}
