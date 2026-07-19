package com.pentagon.String;

public class RemoveAll {
	
	public static String removeAll(String s,char target) {
		String res="";
		for(char ch:s.toCharArray()) {
			if(ch!=target)res=res+ch;
		}
		return res;
	}
	public static void main(String[] args) {
		String s="abcdcaftdbbaaa";
		System.out.println(removeAll(s,'b'));
	}

}
