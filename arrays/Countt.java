package arrays;

public class Countt {

	public static int countElmensts(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,50};
	System.out.println(countElmensts(arr));
	}
}
