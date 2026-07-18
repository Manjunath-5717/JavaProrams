package arrays;


public class ElmentFound {
	
	public static void checkArrayElem(int a[],int elm) {
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==elm) {
				found=true;
			}
		}
		if(found) {
			System.out.println("elemnet is found");
		}else {
			System.out.println("element is not found");
		}
	
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,6,89,72,4};
		checkArrayElem(arr, 100);
	}

}
