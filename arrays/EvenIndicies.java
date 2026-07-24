package arrays;

public class EvenIndicies {
	
	public static void printEvenIndicies(int a[]) {
		for(int i=0;i<a.length;i=i+2) {//to print even indicies elment we acn use another logic if(i%2==0){syso(a[i]);
			System.out.println(a[i] +" " );
		}
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3};
		printEvenIndicies(a);
	}

}
