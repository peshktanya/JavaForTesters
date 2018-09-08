package OOP.Lesson8_Generics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

        public static void main(String args[]){
            List<String> names = new ArrayList();
            names.add("Kate");
            names.add("Anna");
            names.add("Emma");
           // names.add(6);
            Iterator it = names.iterator();

            while(it.hasNext()) {
                String obj = (String)it.next();
                System.out.println(obj);
            }

            System.out.println(names);
        }


}
