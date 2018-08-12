package Lesson5_LocalVars;

public class Lesson5LocalVars {
    public static void main(String[] args) {
        String name = "Tony";
        SayHello("Bob");
        SayHello(name);
        {
            name = "Pete";
        }
        SayHello(name);
        {
            String lastName = "Mickael";
        }
        //SayHello(lastName);
    }

    public static void SayHello( String name ) {
        System.out.printf("Hello, %s\n", name);
        name = "George";
    }
}
