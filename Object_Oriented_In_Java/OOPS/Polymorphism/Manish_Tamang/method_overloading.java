package OOPS.polymorphism;

public class method_overloading {
    public static void main(String[] args){
        Example e=new Example();
        System.out.println(e.sum(10,20));
        System.out.println(e.sum(10f,20f));
        System.out.println(e.sum(10,20,30));
    }
}

class Example{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

