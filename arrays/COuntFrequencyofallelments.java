package arrays;

public class COuntFrequencyofallelments {
	public static void countFrequency(int a[]) {
		
		boolean visited[]=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
		  
		  
		  if(visited[i]==true) {
			  continue;
		  }
		  int count=1;
		  for(int j=i+1;j<a.length;j++) {
			  if(a[i]==a[j]) {
				  count++;
				  visited[j]=true;
			  }
		  }
		  System.out.println("Frequency of "+a[i] +" is "+ count);
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]= {1,5,3,3,4,2,3,2,6,7,5,3};
		countFrequency(arr);
	}

}


