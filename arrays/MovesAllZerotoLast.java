package arrays;

public class MovesAllZerotoLast {
	
	public static void moveAllZero(int a[]) {
		
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
		int[] ar= {1,3,5,0,4,3,0,0,5};
		moveAllZero(ar);
		System.out.println("after all zero move to last");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i] + " ");
		}
	}

}
