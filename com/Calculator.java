import java.util.Scanner;

public class Calculator {
	
	static int add(int a,int b) {
		return a+b;
	}
    public static int mul(int a,int b) {
    	return a*b;
    }
    public static int sub(int a,int b) {
    	return a-b;
    }
    static int div(int a,int b) {
    	return a/b;
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
	
		System.out.println("Enetr the options: +,-,*,/");
		char op=sc.next().charAt(0);
		
		int result=0;
		
		switch(op) {
		case '+':{
			result=add(a,b);
			break;
		}
		case '-':{
			result=sub(a,b);
			break;
		}
		case '*':{
			result=mul(a,b);
			break;
		}
		case '/':{
			if(b!=0) {
			result=div(a,b);
			}else {
				System.out.println("cannot divided by zero");
				return;
			}
			break;
		   }
			
			default:
				System.out.println("Inalid Operation");
				return;	
	}
		System.out.println("Result :"+ result);
	}
}

	
