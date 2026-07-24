package arrays;
//count frequency of a given element in an array
public class CountFrequency {
	
	public static void countFrequency(int a[],int x) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				count++;			}
		}
		System.out.println("Frequency of "+ x +" is "+ count);
		
	}
	public static void main(String[] args) {
		int arr[]= {1,3,5,6,5,6,5,5,89,5,5,5,5,5};
		countFrequency(arr,5);
	}

}
