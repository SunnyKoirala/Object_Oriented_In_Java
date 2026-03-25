package OOPS.construction;

public class copy_constructor {
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        t1.name = "Ram";
        t1.roll = 45;
        System.out.println(t1.name);
        System.out.println(t1.roll);


        Teacher t2 = new Teacher(t1);

        t1.name = "shyam";
        t1.roll = 46;
        System.out.println(t1.name);
        System.out.println(t1.roll);
        System.out.println(t2.name);
        System.out.println(t2.roll);
    }
}
class Teacher{
    String name;
    int roll;
    //copy constructor
    Teacher(Teacher t1){
        this.name=t1.name;
        this.roll=t1.roll;
    }
    Teacher(){
        System.out.println("Constructor is called");
    }
}