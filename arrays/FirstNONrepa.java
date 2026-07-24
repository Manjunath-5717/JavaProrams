package arrays;

public class FirstNONrepa {
	
	public static int nonrepeat(int a[]) {
		for(int i=0;i<a.length;i++) {
			boolean isrepeat=false;
			for(int j=0;j<a.length;j++) {
				if(i!=j && a[i]==a[j]) {
					isrepeat=true;
					break;
				}
			
			}
			if(isrepeat) {
				return a[i];
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int ar[]= {1,1,2,2,3,4,4,5};
		System.out.println(nonrepeat(ar));
	}
}
