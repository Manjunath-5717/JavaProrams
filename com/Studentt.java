public class Studentt {
    
    int id;
    String name;

    Studentt(int id, String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
     
    Studentt s=new Studentt(101,"manju");

    System.out.println(s.id+" "+s.name);
        
    }
    
}
