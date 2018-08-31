package PS.Files;


import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class FileTest {


    // when running cross platform there are differences to be aware of
    // the system properties may not have a / at the end
    // and building file paths by hand can be problematic requiring
    // lots of care
    // so we use the Paths.get instead
    // http://docs.oracle.com/javase/7/docs/api/java/nio/file/Paths.html
    // Then use the returned Path object toFile to create the file object
    // Both Path and Paths have been available since Java 1.7
    // https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html


    @Test
    public void aNewFileDoesNotCreateAFile() throws IOException {
        File aTempFile = new File("d:/tempJava.txt");
        assertFalse(aTempFile.exists(), "File should not exist");
    }

    @Test
    public void createAFileAndDeleteItAlternativeConstructor() throws IOException {

        String tempDir = System.getProperty("java.io.tmpdir");
        File aTempFile = new File(tempDir, "tempJavaForTesters.txt");
        assertFalse(aTempFile.exists());

        aTempFile.createNewFile();
        assertTrue(aTempFile.exists());

        aTempFile.delete();
        assertFalse(aTempFile.exists());
    }

    @Test
    public void listTempDirectory(){
        File tempDir = new File(System.getProperty("java.io.tmpdir"));

        String[] fileList = tempDir.list();

        for(String fileInList : fileList){
            System.out.println(fileInList);
        }
    }

}