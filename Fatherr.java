
class Parent {
    public void house() {
        System.out.println("blue house");
    }
}

class Sonn extends Parent {
    @Override
    public void house() {
        System.out.println("black house");
    }
}

public class Fatherr {
    public static void main(String[] args) {

        Parent p1 = new Sonn();  // runtime polymorphism
        p1.house();              // calls Son's method
    }
} {
    
}
