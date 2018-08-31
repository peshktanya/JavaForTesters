package Fundamentals.Lesson12_Arrays;

public class StringArray {
    public static void main(String[] args) {

        String[] toppings = new String[10];
        toppings[0] = "Cheese";
        toppings[1] = "Pepperoni";
        toppings[2] = "Black Olives";
        for (int i=0; i<toppings.length; i++)
        {
            System.out.print(toppings[i] + " ");
        }
        System.out.println("\n");

        String[] iceCream = {"Banana", "Cherry", "Blackberry", "Vanilla"};
        for (String s: iceCream)
        {
            System.out.print(s + " ");
        }

    }
}
