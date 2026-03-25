package OOPS.inheritance;

public class multi_level_inheritance {
        public static void main(String[] args){
            Dogs d = new Dogs();
            d.eat();
            d.sleep();
            d.legs=4;
            System.out.println(d.legs);
            d.bark();
        }
}
class Animals{
    void eat(){
        System.out.println("Eats");
    }

    void sleep(){ System.out.println("Sleeps");
    }
}
class Mammal extends Animals{
    int legs;
}
class Dogs extends Mammal{
    void bark(){
        System.out.println("Barks");
    }
}