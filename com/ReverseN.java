import java.util.Scanner;
public class ReverseN {

    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);

        System.out.println("enter a number");
        int n=S.nextInt();
        int reversed=0;
        while(n!=0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
           
    }
     System.out.println(reversed);
       
    }
}
