public class Reversepa {
    
    public static void main(String[] args) {
        int n=121;
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

