package OOPS.classAndObject;

public class ClassAndObjectExample {
    public static void main(String[] args)
    {
        Pen p1=new Pen();
        p1.changeColor("Blue");
        p1.changeTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tipSize);
        p1.color="Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tipSize;

    void changeColor(String color) {
        this.color = color;
    }

    void changeTip(int tipSize) {
        this.tipSize = tipSize;
    }
}
