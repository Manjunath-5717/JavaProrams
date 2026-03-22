import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("enter a string");
       String s=sc.nextLine();

       String reversed=new StringBuilder(s).reverse().toString();

       System.out.println(reversed);

       if(s.equals(reversed)){
        System.out.println("it is a palindrome");

       }
       else{
        System.out.println("it is not a palindrome");
       }
        
       }

    }

