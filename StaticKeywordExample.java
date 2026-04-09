package OOPS;

public class StaticKeywordExample {
    public static void main(String[] args)
    {
        Studentz s=new Studentz();
        Studentz s1=new Studentz();
        s.schoolName="Xavier International College";
        s.setcolorName("Blue");
        s1.setcolorName("Red");
        System.out.println(s.getcolorName());
        System.out.println(s1.getcolorName());
        System.out.println(s.schoolName);
        System.out.println(s1.schoolName);
    }
}

class Studentz
{
    String color;
    static String schoolName;

    void setcolorName(String color)
    {
        this.color=color;
    }

     String getcolorName()
    {
        return this.color;
    }
}
