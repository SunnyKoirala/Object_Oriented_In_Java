package OOPS.polymorphism;

public class method_overriding {
    public static void main(String[] args){
        Deer d=new Deer();
        d.eat();

    }
}
class Animalzz{
    void eat(){
        System.out.println("Eats grass");
    }
}

class Deer extends Animalzz{
    void eat() {
       System.out.println("Eats");
    }
}