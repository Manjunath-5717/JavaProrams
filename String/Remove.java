package com.pentagon.String;

public class Remove {
	
	public static String removeLastandFirst(String s) {
		if(s==null) return null;
		String res="";
		for(int i=1;i<s.length()-1;i++) {
			res+=s.charAt(i);
		}
		return res;
	}
public static void main(String[] args) {
	String str="A";
	System.out.println(removeLastandFirst(str));
}
}

