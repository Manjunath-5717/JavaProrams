package arrays;

public class ReverseArrayy {
	
	public static void revrseA(int a[]) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i] +" "  );
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		revrseA(arr);
	}

}
