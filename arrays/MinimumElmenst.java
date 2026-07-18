package arrays;
//print minimum element in an array.
public class MinimumElmenst {
	
	public static int minimmElementArray(int a[]) {
		
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[]= {5,7,8,6,2,8};
		System.out.println(minimmElementArray(arr));
	}

}
