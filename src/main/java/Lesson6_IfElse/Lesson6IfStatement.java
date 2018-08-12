package Lesson6_IfElse;

public class Lesson6IfStatement {

    public static void main(String[] args) {
        //if
        boolean bool = true;
        if (bool) {
            System.out.println("bool - истина");
        }

        //if-else
        int a = 1;
        int b = 3;
        if (a == b) {
            //Если a равно b - выводим сообщение
            System.out.println("a и b равны!");
        }
        else{
            //Если a не равно b - выводим сообщение
            System.out.println("a и b не равны!");
        }

        //if-else
        System.out.println(a==b ? "a и b равны!" : "a и b не равны!");

        //if-else-if-else
        double amount = 1000;
        double withdrawRate;

        if (amount <= 100) {
            withdrawRate = 10;
        } else if (amount <= 500) {
            withdrawRate = 5;
        } else if (amount <= 1000) {
            withdrawRate = 2;
        } else {
            withdrawRate = 1;
        }
        System.out.println("withdrawRate = " + withdrawRate);
    }

}
