package Lesson23.Files;

import org.testng.annotations.Test;

import java.io.*;

import static org.testng.Assert.assertEquals;

public class ReadTextFilesTest {

    @Test
    public void readATextFileWithBufferedReader() throws IOException {

        File inputFile = writeTheTestDataFile();

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        int lineCount = 0;

        try{
            String line;

            // readLine returns null when it reaches the end of the file
            while((line = reader.readLine())!=null){
                // readline strips off the end of line characters
                System.out.println("line number " + line.replace("line ",""));
                lineCount ++;
            }

            assertEquals(lineCount, (5));

        }finally{
            reader.close();
        }
    }


    @Test
    public void outputFileToSystemOutWithBufferedReader() throws IOException {

        File inputFile = writeTheTestDataFile();
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        try{
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }finally{
            reader.close();
        }
    }

    private File writeTheTestDataFile() throws IOException {
        File outputFile = File.createTempFile("forReading", null);
        PrintWriter print = new PrintWriter(
                                new BufferedWriter(
                                    new FileWriter(outputFile)));

        for(int lineNumber = 1; lineNumber < 6; lineNumber++){
            print.println("line " + lineNumber);
        }

        print.close();
        return outputFile;
    }
}