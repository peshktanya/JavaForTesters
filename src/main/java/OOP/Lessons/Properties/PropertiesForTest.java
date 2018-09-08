package OOP.Lessons.Properties;

import java.util.Properties;

public class PropertiesForTest {


        public static void main(String args[]){

            Properties properties = new Properties();

            System.out.println("Property size is : " + properties.size());
            properties.setProperty("browser", "firefox");
            properties.setProperty("port", "80");
            System.out.println("Property size is : " + properties.size());
            System.out.println("Get Property for browser : " + properties.getProperty("browser"));
            System.out.println("Get Property for port : " +properties.getProperty("port"));



            System.out.println( properties.getProperty("missing", "default"));

            System.out.println( properties.containsKey("browser"));
        }
}
