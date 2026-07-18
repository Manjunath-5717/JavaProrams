package arrays;
//count elements greater than a given number
public class Graterthan {
	
	public static void countGreater(int a[],int x) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>x) {
				count++;
			}
		}
		System.out.println("count of elements grateher than "+ x +" is "+ count);
	}
	public static void main(String[] args) {
		int[] a= {2,4,6,8,90,30,5};
		countGreater(a,4);
		
	}

}
