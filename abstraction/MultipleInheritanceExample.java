package OOPS.abstraction;

public class MultipleInheritanceExample {
    public static void main(String[] args)
    {
        Bear b=new Bear();
        b.eats();
    }
}

interface Herbivore{
    void eats();
}
interface Carnivore{
    void eats();
}

class Bear implements Herbivore,Carnivore{
    public void eats(){
        System.out.println("Eats grass and meats");
    }
}