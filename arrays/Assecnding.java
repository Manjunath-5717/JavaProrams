package arrays;

public class Assecnding {
	
	public static boolean assecnding(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i] >a[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int a[]= {1,5,8,4,6,7};
		System.out.println(assecnding(a));
	}

}
