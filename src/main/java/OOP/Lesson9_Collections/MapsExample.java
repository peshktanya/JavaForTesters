package OOP.Lesson9_Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
    public static void main(String[] args) {
        /**
         * Hash map
         */
        Map<Integer, String> mapHttpErrors = new HashMap<>();

        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");
       // mapHttpErrors.put(500, "Not OK");
        System.out.println(mapHttpErrors);


        /**
         * Linked Hash map
         */
        Map<String, String> mapContacts = new LinkedHashMap<>();

        mapContacts.put("0509238175", "Tom");
        mapContacts.put("0974891321", "Peter");
        mapContacts.put("0985678912", "Mary");
        mapContacts.put("0981127421", "John");
        //add duplicates
        mapContacts.put("0681127421", "John");
        mapContacts.put("0681127421", "Brad");
        System.out.println(mapContacts);

        /**
         * Tree map
         */
        Map<String, String> mapLang = new TreeMap<>();

        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");
        //duplicate
        mapLang.put(".xml", "C++");
        System.out.println(mapLang);

        // What can I do with hashMap
        String status301 = mapHttpErrors.get(301);
        System.out.println("301: " + status301);

        if (mapHttpErrors.containsKey(200)) {
            System.out.println("Http status 200");
        }
        if (mapHttpErrors.containsValue("OK")) {
            System.out.println("Found status OK");
        }

    }
}
