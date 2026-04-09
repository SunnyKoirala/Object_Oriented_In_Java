package OOPS.constructor;

public class CopyConstructorExample {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ram",45);
        Teacher t2=new Teacher(t1);
        System.out.println(t2.name);
        System.out.println(t2.roll);
    }
}

class Teacher{
    String name;
    int roll;
    Teacher(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Copy constructor
    Teacher(Teacher t1) {
        this.name = t1.name;
        this.roll = t1.roll;
    }

}
