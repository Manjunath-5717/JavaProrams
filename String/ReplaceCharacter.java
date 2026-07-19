package com.pentagon.String;

public class ReplaceCharacter {
	
	public static String change(String s,char target,char specila) {
		
		String res="";
		for(char ch:s.toCharArray()) {
			if(ch==target)res=res+specila;
			else res=res+ch;
		}
		return res;
	}
	
	public static void main(String[] args) {
		String s="AAABBBBBCCCDDD";
		System.out.println(change(s,'B','M'));
	}

}
