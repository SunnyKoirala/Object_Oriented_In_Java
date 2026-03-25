package Arrays;

public class Call_by_Refrence {
    public static void update(int[] marks){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String[] args){
        int[] maarks= {40,50,60};
        update(maarks);
        System.out.println("The update marks is: ");
        for(int i=0; i<maarks.length; i++){
            System.out.println(maarks[i]);
        }
    }
}
