package com.pentagon.String;

public class Driver {
	
	public static String Upper(String s) {
		
		String res="";
	    for(int i=0;i<s.length();i++) {
	    	if(s.charAt(i)==' ') {
	    		res=res+i;
	    		
	    	}
	    }
		
		
	}
	
	public static void main(String[] args) {
		String str="i love bangalore";
		
		String f=Upper(str);
		System.out.println(f);
		
	}

}
