package arrays;

public class ReturnIndex {
	public static int checkArry(int a[],int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele){
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
int arr[]= {4,5,6,78,9};
System.out.println(checkArry(arr, 78));
	}
}
