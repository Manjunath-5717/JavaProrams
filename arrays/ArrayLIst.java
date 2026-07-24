package arrays;

import java.util.ArrayList;

public class ArrayLIst {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		//to add values in arrylist we use add()
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		System.out.println(arr + " ");
		
		//size of the array of arr
		System.out.println("size of an array:"+arr.size());
		
		//removet element from array at 1st index.
		arr.remove(1);
		System.out.println(arr + " ");
		
	
		
	}
}
