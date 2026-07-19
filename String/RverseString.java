package com.pentagon.String;

public class RverseString {
	
	public static void Reverse(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			res=res+ch;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		String str="manju";
		Reverse(str);
	
		
		
	}

}
