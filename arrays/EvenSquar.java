package arrays;

public class EvenSquar {
	
	public static void replaceEvenElem(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				a[i]=a[i]*a[i];
			}
		}
	}
	public static void main(String[] args) {
		int ar[]= {2,4,5,7,6,4};
		replaceEvenElem(ar);
		System.out.println("aftere replacing even elemnts with their squares: ");
		for(int i=0;i<ar.length;i++) {
		
			System.out.println(ar[i]);
		}
	}

}
