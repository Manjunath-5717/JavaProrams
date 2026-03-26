public class A {
	
	A(){
		System.out.println("Hello Guys");
	}
    
	A(String name){
		this();
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		A a=new A("Manju");
		

	}

}
