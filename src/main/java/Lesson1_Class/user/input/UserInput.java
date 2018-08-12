package Lesson1_Class.user.input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String line = cs.nextLine();
        System.out.println(line);
    }
}
