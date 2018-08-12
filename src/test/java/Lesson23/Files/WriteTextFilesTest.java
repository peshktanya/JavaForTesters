package Lesson23.Files;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

public class WriteTextFilesTest {

    @Test
    public void outputWithFileWriter() throws IOException {
        File outputFile = File.createTempFile("fileWriter", null);

        FileWriter fileWriter = new FileWriter(outputFile);
        fileWriter.write("Simple Report With OutputWriter");
        fileWriter.write("===============================");
        fileWriter.close();

        Assert.assertEquals(outputFile.length(), (62L));
    }

    @Test
    public void outputWithPrintWriter() throws IOException {
        // this writes each string immediately and can be inefficient
        File outputFile = File.createTempFile("printWriter", null);
        FileWriter writer = new FileWriter(outputFile);
        PrintWriter print = new PrintWriter(writer);
        print.println("Simple Report Using PrintWriter");
        print.println("===============================");
        print.close();

        // printl adds end of line chars
        String lineEnd = System.lineSeparator();
        long fileLen = 62L + lineEnd.length() + lineEnd.length();
        Assert.assertEquals(outputFile.length(), (fileLen));
    }

    @Test
    public void useFileWriterToCreateTheFile() throws IOException {

        String tempDirectory = System.getProperty("java.io.tmpdir");
        String fileName = "fileWriterCreated" + String.valueOf(System.currentTimeMillis()) + ".tmp";
        File outputFile = new File(tempDirectory, fileName);

        // this writes each string immediately and can be inefficient
        FileWriter writer = new FileWriter(outputFile);
        PrintWriter print = new PrintWriter(writer);
        print.println("fileWriter Create a PrintWriter");
        print.println("===============================");
        print.close();

        // printl adds end of line chars
        String lineEnd = System.lineSeparator();
        long fileLen = 62L + lineEnd.length() + lineEnd.length();
        Assert.assertEquals(outputFile.length(), (fileLen));
    }

}