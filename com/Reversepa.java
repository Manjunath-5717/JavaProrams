import java.util.Scanner;
public class Reversepa {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a Number");
    int n=sc.nextInt();
        int  reversed=0;
        int original=n;

        while(n!=0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
          
        }
            if(original==reversed){
                System.out.println("it is palindrome");
            }
            else{
                System.out.println("it is not a palindrome");
            }

        }
    }

