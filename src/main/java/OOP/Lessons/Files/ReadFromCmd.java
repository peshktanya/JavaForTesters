package OOP.Lessons.Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromCmd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lines = new ArrayList<String>();
        String lineNew;

        while (input.hasNextLine()) {
            lineNew = input.nextLine();
            if (lineNew.isEmpty()) {
                break;
            }
            lines.add(lineNew);
        }

        System.out.println("Content of List<String> lines:");
        for (String string : lines) {
            System.out.println(string);
        }
    }
}
