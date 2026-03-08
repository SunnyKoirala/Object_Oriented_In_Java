package OOPS.abstraction;

public class AbstractClassExample {
    public static void main(String[] args)
    {
        Mustang m=new Mustang();
//        Horsez h=new Horsez();
        System.out.println(m.color);

    }
}

abstract class Animaliz {
    String color;
    Animaliz()
    {
        color="brown";
        System.out.println("Animal constructor called");
    }
    abstract void walk();


}

class Horsez extends Animaliz{
    Horsez(){
        System.out.println("Horsez constructor called");
    }
    void changeColor()
    {
        color="dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs ");
    }


    }

    class Mustang extends Horsez{
   Mustang(){
       System.out.println("Mustang constructor called");
   }
    }

