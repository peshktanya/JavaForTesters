package OOP.Lessons.Files;
import java.io.*;
import java.util.*;
import java.util.List;

public class ReadFileToList {
    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<String>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Test\\MyFile.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } finally {
            reader.close();
        }

        System.out.println(lines);
        System.out.println("Number of lines in txt file : " + lines.size());
        lines.get(2);
    }
}

