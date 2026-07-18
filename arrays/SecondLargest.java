package arrays;

public class SecondLargest {

	public static void secondLargest(int  a[]) {
		
		int largest=a[0];
		int seclargest=a[0];
		for(int i=1;i<a.length;i++) {
			int ele=a[i];
			if(ele>largest) {
				seclargest=largest;
				largest=ele;
			}else if(ele>seclargest && ele!=largest) {
				seclargest=ele;
			}
			
		}
		System.out.println("second largest elment is "+seclargest);
	}
	
	public static void main(String[] args) {
		int a[]= {57,67,77,5,4,8,99};
		secondLargest(a);
		
	}
}
