package OOPS;

public class SuperKeywordExample {
    public static void main(String[] args)
    {
        Python p =new Python();
        System.out.println(p.color);
        p.printSnakeColor();
    }
}

class Snake
{
    String color;
    Snake(){
        color="Red";
        System.out.println("Snake constructor called");
    }
}

class Python extends Snake{
    String color;
    Python()
    {
        color="Blue";
        System.out.println("Python constructor called");
    }
    void printSnakeColor(){
        System.out.println(super.color);
    }
}
