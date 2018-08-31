package Fundamentals.Lesson5_LocalVariables;

public class LocalVars {
    public static void main(String[] args) {
        String name = "Tony";

        SayHello("Bob");
        SayHello(name);

        {
            name = "Peter";
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
