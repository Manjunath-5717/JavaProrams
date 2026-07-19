package com.pentagon.String;
//odd index become small and Even index become Alpa

public class EvenOdd {
	
	public static String Conversion(String s) {
		String res="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i%2==0 && (ch>='a'&& ch<='z')) {
				ch-=32;
				res=res+ch;
			}else if(i%2!=0&&(ch>='A'&& ch<='Z')) {
				ch+=32;
				res=res+ch;
			}else res=res+ch;
		}
		return res;
		
	}
	
public static void main(String[] args) {
	String str="@AeWS.c5Gj";
	System.out.println(Conversion(str));
	
}
}
