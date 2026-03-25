public class Additionn {
	int a;
	int b;
	int c;
	Additionn(int a,int b){
		this.a=a;
		this.b=b;
		}
	Additionn(int a,double b){
		this.a=a;
		this.b=(int)b;
	}
	Additionn(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public static void main(String[] args) {
		
		Additionn a1=new Additionn(10,20);
		Additionn a2=new Additionn(10,10.0);
		Additionn  a3=new Additionn(10,20,30);
		
		System.out.println("additon of two numbers: "+(a1.a+a1.b));
		System.out.println("addition of two numbers: "+(a2.a+a2.b));
		System.out.println("addition of three numbers: "+(a3.a+a3.b+a3.c));
		

	}

}
