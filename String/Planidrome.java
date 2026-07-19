package com.pentagon.String; // package names should be lowercase

public class Planidrome {

    
    public static void reverse(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }

        if (s.equals(res)) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        String str = "manju";
        reverse(str);

        String str2 = "madam";
        reverse(str2);
    }
}
