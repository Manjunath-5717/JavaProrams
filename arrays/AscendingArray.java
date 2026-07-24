package arrays;

public class AscendingArray {
	
	public static boolean isascending(int[]a) {
		
		int prev=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<prev)return false;
			else prev=a[i];
		
		}
		return true;
	}
	public static void main(String[] args) {
		int[]a ={1,2,3,4,5};
		boolean flag=isascending(a);
		System.out.println(flag);
		
		
	}

}
