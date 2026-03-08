package OOPS.inheritance;

public class HierarchialInheritance {
public static void main(String[] args){
    Fishs f=new Fishs();
    f.eat();
    f.swim();
    Bird b=new Bird();
    b.eat();
    b.fly();
    Mammals m=new Mammals();
    m.eat();
    m.walk();
}
}

class Animalss {
    void eat() {
        System.out.println("eats");
    }
}

    class Fishs extends Animalss {
        void swim() {
            System.out.println("It can swims");
        }
    }

    class Bird extends Animalss{
        void fly(){
            System.out.println("It can fly");
        }

    }

    class Mammals extends Animalss{
        void walk(){
            System.out.println("It can walk");
        }
    }


