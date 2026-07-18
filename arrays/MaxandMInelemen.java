package arrays;

public class MaxandMInelemen {
	
	public static void maxMin(int a[]) {
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			int elm=a[i];
			if(elm>max) {
				max=elm;
			}else if(elm<min) {
				min=elm;
			}
			
		   
		}
		System.out.println("maximun element is "+ max);
		System.out.println("minimum element is "+ min);
	}
	public static void main(String[] args) {
		int arr[]= {10,20,50,30,40};
		maxMin(arr);
	}

}
