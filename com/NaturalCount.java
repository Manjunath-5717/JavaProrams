import java.util.Scanner;
public class NaturalCount {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the numbers: ");
     int n=sc.nextInt();
        
        int count=0;
        while(n!=0){
            int digit= n%10;
            count++;
            n=n/10;

        }
        System.out.println("the no of count is:" + count);
    }
    
}
