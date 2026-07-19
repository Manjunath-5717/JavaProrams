package com.pentagon.String;

public class Count {
	
	public static void vowels(String s) {
		int vowelCount=0, numcount=0,spcount=0,conscount=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A'&& ch<='Z') ||(ch>='a'&& ch<='z')){
			if(ch=='A' || ch=='E'|| ch=='I' ||ch=='O' || ch=='U' || ch=='a' || ch=='e'|| ch=='i' ||ch=='o' || ch=='u') {
				vowelCount++;
			}
			else conscount++;
			}
			else if(ch>='0' && ch<='9') 
				numcount++;
			 else spcount++;
			}
		System.out.println("vowels:"+ vowelCount);
		System.out.println("consnant"+conscount);
		System.out.println("numbers :"+numcount);
		System.out.println("spechracter: "+spcount);
		}
	
		
		
	

	public static void main(String[] args) {
		String str="aBc#ab1";
		vowels(str);
	}
}