package OOPS.Abstraction;

public class AbstractClassExample {
    public static void main(String[] args){
        Mustang m=new Mustang();
        m.walk();
        Horsez h=new Horsez();
        h.changeColor();
        System.out.println(h.color);

    }
}

abstract class Animalz{
    String color;
    Animalz(){
        color="brown";
        System.out.println("Animal constructor called");
    }
    abstract void walk();

}

class Horsez extends Animalz{
    Horsez(){
        System.out.println("Horsez constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Mustang extends Horsez{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}