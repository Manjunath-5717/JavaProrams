package arrays;

public class UniqueNo {

	public static void printUnique(int a[]) {
		for(int i=0;i<a.length;i++) {
			boolean Unique=true;
			for(int j=0;j<a.length;j++) {
				if(i!=j &&a[i]==a[j]) {
					Unique=false;
					break;
				}
			}
			if(Unique) {
				System.out.println(a[i] +" ");
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {2,3,4,5,2,3,6,7,8,6,7,7};
		printUnique(a);
	}
}
