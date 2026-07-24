package arrays;

public class ZeroLast {
	
	public static void moveAllzeroToEnd(int a[]) {
		
		int count=0;//count of non-zero elements
		for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			a[count++]=a[i];
		}
		}
		while(count<a.length) {
			a[count++]=0;
		}
		
		
	}
	public static void main(String[] args) {
		int ar[]= {2,4,5,0,9};
		moveAllzeroToEnd(ar);
		System.out.println("Array after moving zeros to the ned");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+ " ");
		}
	}

}
