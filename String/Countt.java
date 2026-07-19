package com.pentagon.String;

public class Countt {
	
	public static int count(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String str="manjunatha";
		System.out.println(count(str));

}
}
