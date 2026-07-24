package arrays;
//replace odd elemenst with their cubes
public class ReplaceWithcube {

	public static void replceSquare(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
			a[i]=a[i]*a[i]*a[i];
			
			}
			
		}
		
		}
public static void main(String[] args) {
		
	int ar[]= {2,3,4,5,6,7};
	replceSquare(ar);
	System.out.println("arry aftere replacjingg with cube");
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
		
		
	}

	

}
