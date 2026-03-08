package OOPS.polymorphism;

public class MethodOverriding {
    public static void main(String[] args)
    {
        Deer d=new Deer();
        d.eat();
    }
}

class Animalzz {
    void eat() {
        System.out.println("eat grass");
    }
}
    class Deer extends Animalzz{
        void eat(){
            System.out.println("eats grass");
        }
    }

