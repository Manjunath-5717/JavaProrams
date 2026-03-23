public class StudentNOar {
    int id;
    String name;

    StudentNOar( ){
        System.out.println("hello Guys");
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.id=30;
        s.name="manju";

        System.out.println(s.name);
        System.out.println(s.id);
    }
}
