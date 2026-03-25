package OOPS.inheritance;

public class Single_level_Inheritance {
    public static void main(String[] args){
        Fish f = new Fish();
        f.eat();
        f.fins();

    }
}
class Animal{
    void eat(){System.out.println("It can eat");}

    void breathe(){System.out.println("It can breathe");}

    void skin_color(){System.out.println("Has skin color");}
}

class Fish extends Animal{
    void fins(){System.out.println("Swims with the help of fins");}
}