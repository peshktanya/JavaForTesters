package OOP.Lesson2_Null;

public class Test {
    public static void main(String args[]) {
        Integer iAmNull = null;
        if(iAmNull instanceof Integer){
            System.out.println("iAmNull is instance of Integer");
        }
        else{
            System.out.println("iAmNull is NOT an instance of Integer");
        }
    }
}


