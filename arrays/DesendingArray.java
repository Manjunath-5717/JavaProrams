package arrays;

public class DesendingArray {
	
	public static boolean isascending(int[]a) {
		
		int prev=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>prev) {return false;
			
			}else prev=a[i];
		}
		return true;
	}
	public static void main(String[] args) {
		int[]a ={5,4,3,2,1};
		boolean flag=isascending(a);
		System.out.println(flag);
		
		
	}

}
