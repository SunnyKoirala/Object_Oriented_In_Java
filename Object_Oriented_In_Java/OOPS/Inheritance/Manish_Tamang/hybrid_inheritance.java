package OOPS.inheritance;

public class hybrid_inheritance {
        public static void main(String[] args){
        Fishss f = new Fishss();
        System.out.println("Fish :");
            f.eat();
            f.swim();
            Cat_fish c = new Cat_fish();
            System.out.println("cat Fish :");
            c.eat();
            c.big();
            Shark s = new Shark();
            System.out.println("Shark:");
            s.eat();
            s.teath();
            Birds b = new Birds();
            System.out.println("Bird :");
            b.eat();
            b.fly();
            Mammalss m = new Mammalss();
            System.out.println("Mammal :");
            m.eat();
            m.walk();

        }
    }
    class Animalsss{
        void eat(){
            System.out.println("eats");
        }
    }
    class Fishss extends Animalsss {
        void swim(){
            System.out.println("It can swim");
        }
    }

    class Cat_fish extends Fishss {
        void big(){
            System.out.println("It is big");
        }
    }

    class Shark extends Fishss {
    void teath() {
        System.out.println("Has sharp teath");
    }
    }
    class Birds extends Animalsss {
        void fly(){
            System.out.println("It can fly");
        }
    }

    class Mammalss extends Animalsss {
        void walk(){
            System.out.println("It can walk");
        }
    }

