package com.pentagon.String;



public class Spaces {
	
	public static int countSpace(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')count++;
		
			
		}
		return count;
	}
	public static void main(String[] args) {
		
		String str="ab   AD 8C Bjc ";
		System.out.println(countSpace(str));
	}

}
