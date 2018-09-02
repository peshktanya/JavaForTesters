package Fundamentals.Lesson6_IfElse;

public class ManyIfElseIfElse {

    public static void main(String[] args) {

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
