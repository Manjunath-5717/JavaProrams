package arrays;

public class FirstReapating {

//	public static int firstReapt(int a[]) {
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//			       return a[i];
//					
//				}
//			}
//			
//		}
//		return -1;
//	}
//	public static void main(String[] args) {
//		int ar[]= {1,2,3,4,5,6};
//		System.out.println(firstReapt(ar));
//	}
	
	
	public static int firstRepeat(int a[]) {
		for(int i=0;i<a.length;i++) {
			boolean isrepate=false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					isrepate=true;
				}
			}
			if(isrepate) {
				return a[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6};
		System.out.println(firstRepeat(ar));
	}
}
