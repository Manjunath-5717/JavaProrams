public class Studenttt {
	int id; 
	String name;
	long ph_no;
	
	Studenttt(){
		System.out.println("hello Student");
	}
    Studenttt(int id,String name){
    	this.id=id;
    	this.name=name;
    	
    }
    Studenttt(int id,String name,long ph_no){
    	this.id=id;
    	this.name=name;
    	this.ph_no=ph_no;
    }
	public static void main(String[] args) {
		
		Studenttt s1=new Studenttt();
		Studenttt s2=new Studenttt(101,"manju");
		Studenttt s3=new Studenttt(102,"anath",901902667);
		
		
		System.out.println(s2.id+" "+s2.name);
		System.out.println(s3.id+" "+s3.name+" "+s3.ph_no);
		
		

	}

}
