package arrays;

import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args) {
		
		MYownArray<Integer> a = new MYownArray<>();

		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);

		System.out.println(a);
	

		System.out.println(a.contains(30));
	
		a.remove(20);

		System.out.println(a);
		
		System.out.println(a.contains(20));
		System.out.println(a.size(null));
	}

}
