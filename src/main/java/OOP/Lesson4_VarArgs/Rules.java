package OOP.Lesson4_VarArgs;

public class Rules {

    //Compile time error
    //void method(String... a, int... b){}
    //Compile time error
//    void method(int... a, String b){}

      static void method(int num, String... values) {
        System.out.println("number is " + num);
        for (String s : values) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        method(28,"February");//one argument
        method(31,"January","March","May","September");//four arguments
        method(30,"April","October","December");//three arguments
        //method("May", "June", "July"); // no int value
        method(29);
    }
}
