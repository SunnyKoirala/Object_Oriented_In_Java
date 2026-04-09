package OOPS.abstraction;

public class InterfaceExample {
    public static void main(String[] args)
    {
        Rook r = new Rook();
        r.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right , diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves()
    {
        System.out.println("up, down, left right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(1 step at a time)");
    }
}
