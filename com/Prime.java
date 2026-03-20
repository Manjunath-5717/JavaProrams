public class Prime {
    public static void main(String[] args) {
        int num=3;
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
                count++;
            }
        }
        if(count==2){
            System.out.println("it is a prime number");
        }else{
            System.out.println("it is not a palindrome");
        }
    }
    
}
