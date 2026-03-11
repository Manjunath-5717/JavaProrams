public class Child extends Father{
	String bikename="GT 650";

	public static void main(String[] args) {
		Child c=new Child();
		Father f=new Father();
		System.out.println(c.housename);
		System.out.println(c.money);
		System.out.println(c.carbrand);
		System.out.println(c.bikename);
		
		System.out.println(f.housename +" "+ f.money+" "+" "+f.carbrand);
	

	}

}
