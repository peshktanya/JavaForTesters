package Lesson12_Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySimpleTest {

        @Test
        public void simpleArrayExample(){
            String[] numbers0123 = {"zero", "one", "two", "three"};

            for(String numberText : numbers0123){
                System.out.println(numberText);
            }

            Assert.assertEquals("zero", numbers0123[0]);
            Assert.assertEquals("three", numbers0123[3]);
        }

}
