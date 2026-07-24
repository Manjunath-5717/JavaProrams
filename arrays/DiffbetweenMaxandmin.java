package arrays;

public class DiffbetweenMaxandmin {

	public static void diffbetweenminmax(int[]a) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			int elem=a[i];
			if(elem<min)min=elem;
			if(elem>max)max=elem;
		}
		System.out.println(max-min);
	}
	public static void main(String[] args) {
		int []a= {1,4,3,4,5,7};
		diffbetweenminmax(a);
	}
}
