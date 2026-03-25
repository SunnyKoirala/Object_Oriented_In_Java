package Exception_and_Error;

public class Finally_keyword {
    public static void main(String[] args){
        try {
        int result = 10 / 0; //risky word
    }
        catch(ArithmeticException e)

    {
        System.out.println("Cannot divide by zero");
    }finally {
        System.out.println("Finally block always executes");
    }


    }
}
