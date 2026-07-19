package com.pentagon.String;

public class Container {
	
	public static boolean contains(String s,char ch) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) { return true;	
		}
		}
		return false;
	}
	public static void main(String[] args) {
		
		String str="bc1d#";
		System.out.println(contains(str,'1'));
	}

}
