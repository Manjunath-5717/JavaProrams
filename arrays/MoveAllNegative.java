package arrays;
//move negative numberes to the beginning
public class MoveAllNegative {
	public static void moveAllNeg(int a[]) {
		int j=0;
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				if(i!=j) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
			}
			
		}
	}
	public static void main(String[] args) {
		int ar[]= {-1,3,4,5,-5,6,-7};
		moveAllNeg(ar);
		System.out.println("array after move negative no to the front");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i] + " ");
		}
	}

}
