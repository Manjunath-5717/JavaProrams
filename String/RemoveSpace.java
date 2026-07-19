package com.pentagon.String;

public class RemoveSpace {

	public static String removeSpace(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')continue;
			res+=s.charAt(i);
		}
		return res;
		
	}
	public static void main(String[] args) {
		String str=" I LOVE BLR";
		System.out.println(removeSpace(str));
	}
}
