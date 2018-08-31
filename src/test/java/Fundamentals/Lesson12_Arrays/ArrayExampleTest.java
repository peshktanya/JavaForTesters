package Fundamentals.Lesson12_Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayExampleTest {

        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};

        @Test
        public void forEachLoop(){
            String days="";

            for(String workday : workdays){
                days = days + "|" + workday;
            }

            Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
        }

        @Test
        public void forLoopWithFixedCondition(){
            String days="";

            for(int i=0; i<5; i++){
                days = days + "|" + workdays[i];
            }

            Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
        }

        @Test
        public void forLoopUsingIndexFixedCondition(){
            String days="";

            for(int i=0; i<5; i++){
                days = days + "|" + i + "-" + workdays[i];
            }

            Assert.assertEquals(
                    "|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday",
                    days);
        }

        @Test
        public void forLoopMissingInitialization(){
            String days="";

            int i=0;
            for(; i<5; i++){
                days = days + "|" + workdays[i];
            }
            Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
        }

        @Test
        public void forLoopMissingIterator(){
            String days="";

            int i=0;
            for(; i<5; ){
                days = days + "|" + workdays[i];
                i++;
            }
            Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
        }

        @Test
        public void forLoopMissingEverything(){
            String days="";
            int i=0;
            for(; ; ){
                days = days + "|" + workdays[i];
                i++;
                if(i>=5) break;
            }
            Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
        }

        @Test
        public void forEachWithIndex(){
            String days="";
            int dayindex =0;
            for(String workday : workdays){
                days = days + "|" + workday;
                System.out.println("found " + workday +
                        " at position " + dayindex);
                dayindex++;
            }
            Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
        }

        @Test
        public void accessValuesInArray(){

            Assert.assertEquals("Monday", workdays[0]);
            Assert.assertEquals("Friday", workdays[4]);
        }

        @Test
        public void arraySize(){
            Assert.assertEquals(5, workdays.length);
        }

        @Test
        public void arraySizeInForLoop(){
            String days="";

            for(int i=0; i<workdays.length; i++){
                days = days + "|" + workdays[i];
            }
            Assert.assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
        }

}
