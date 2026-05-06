public class Studen {
	
	Studen(){
		System.out.println("hello guys");
	}
    Studen(int id){
    	this();
     System.out.println(id);	
    }
    Studen(int id,String name){
    	this(id);
    	System.out.println(name);
    }
	public static void main(String[] args) {
		
		Studen s=new Studen(101,"manju");
		
		

	}

}
