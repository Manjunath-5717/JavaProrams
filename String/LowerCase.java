package com.pentagon.String;

public class LowerCase {
	
	public static String toUpper(String s) {
		
		String res="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>='A'&& ch<='Z') {
				ch+=32;
				res=res+ch;
				
			}else {
				res=res+ch;
			}
			
		}
		return res;
		
	}
	
	
	
	public static void main(String[] args) {
		
		String str="abCd@8rH";
		String res=toUpper(str);
		System.out.println(res);
		
		
	}
	
}
