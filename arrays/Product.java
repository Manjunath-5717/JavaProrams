package arrays;
//product of all elments
public class Product {
	public static int productArray(int ar[]) {
	int product=1;
	for(int i=0;i<ar.length;i++) {
		product=product*ar[i];
	}
	return product;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7};
		System.out.println(productArray(arr));
	}
}
