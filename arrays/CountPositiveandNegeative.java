package arrays;
//count positive and negative elements
public class CountPositiveandNegeative {
	
	public static void countposandneg(int a[]) {
		int countpos=0;
		int countneg=0;
		
		for(int i=0;i<a.length;i++) {
			int elem=a[i];
			if(elem>0) {
				countpos++;
			}else {
				countneg++;
			}
		}
		System.out.println("Postive count: "+countpos);
		System.out.println("negative count: "+countneg);
	}
public static void main(String[] args) {
	int arr[]= {1,-1,34,56,-3,3,-8,-9,5};
	countposandneg(arr);
}
}
