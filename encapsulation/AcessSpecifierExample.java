package OOPS.encapsulation;

public class AcessSpecifierExample {
    public static void main(String[] args)
    {
        Bank b=new Bank();
        b.setPassword("helloworld");
        System.out.println(b.getPassword());
    }

}

class Bank{
    private String password;
    void setPassword(String password)
    {
        this.password=password;
    }

    String getPassword()
    {
        return this.password;
    }
}
