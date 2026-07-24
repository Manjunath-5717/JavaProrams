package arrays;

public class MoveALLZerotolast {
	
	public static void moveAllzero(int a[]) {
		int count=0;
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
		int ar[]= {1,0,5,9,0,5,4,6};
		moveAllzero(ar);
		System.out.println("array aftere moving all zero to the last: ");
		for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]+ " ");
		}
	}

}
