package OOPS;

public class objectAndClassExp {
    public static void main(String args[]){
        pen p1 = new pen();
        p1.ChangeColor("Blue");
        p1.ChangeLength(5);

        System.out.println(p1.color);
        System.out.println(p1.length);
        p1.color = "red";

        System.out.println(p1.color);


    }
}
class pen{

    //properties
    String color;
    int length;

    //behaviours

    void ChangeColor(String color){
        this.color = color;
    }

    void ChangeLength(int length){
        this.length = length;
    }

        }

