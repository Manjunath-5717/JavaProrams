package arrays;

public class ReplaceNegwithZero {
	
	public static void replaceNegtive(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				a[i]=0;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {-1,2,4,67,89,-3,-5,89};
		replaceNegtive(arr);
	}

}
