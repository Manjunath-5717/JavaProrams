package arrays;
//return he product of elements of an array
public class program5 {
	
	public static int productElmets(int a[]) {
		
		int pro=1;
		for(int i=0;i<a.length;i++) {
			pro=pro*a[i];
		}
		return pro;
	}
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	System.out.println(productElmets(arr));
}
}
