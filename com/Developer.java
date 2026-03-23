public class Developer extends Employee{
	
  @override
  void action() {
	  System.out.println("developing software");
  }
	public static void main(String[] args) {
	 Employee e=new Employee();
	 e.action();
	 
	 Developer d=new Developer();
	 d.action();

	}

}
