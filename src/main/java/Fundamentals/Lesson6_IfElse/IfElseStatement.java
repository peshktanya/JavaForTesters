package Fundamentals.Lesson6_IfElse;

public class IfElseStatement {

    public static void main(String[] args) {
        //if-else
        int a = 1; int b = 3;
        if (a == b) {
            //Если a равно b - выводим сообщение
            System.out.println("a и b равны!");
        }
        else{
            //Если a не равно b - выводим сообщение
            System.out.println("a и b не равны!");
        }

        //if-else ternary
        System.out.println(a==b ? "a и b равны!" : "a и b не равны!");
    }

}
