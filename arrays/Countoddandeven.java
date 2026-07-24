package arrays;
//count even and odd elements
public class Countoddandeven {

	public static void countEvenOddElem(int a[]) {
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++) {
			int ele=a[i];
			if(a[i]%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
		}
		System.out.println("even conut is: "+ evencount);
		System.out.println("odd count is: "+oddcount);
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,15,45,33};
		countEvenOddElem(arr);
	}
}
