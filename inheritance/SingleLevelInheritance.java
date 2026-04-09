package OOPS.inheritance;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
    }
}

class Animal{
    void eat()
    {
        System.out.println("It can eat");
    }

    void breathe(){
        System.out.println("Breaths");
    }

    void skinColor(){
        System.out.println("Has skin color");
    }
}

class Fish extends Animal{
    void fins()
    {
        System.out.println("Swims with the help of fins");
    }
}
