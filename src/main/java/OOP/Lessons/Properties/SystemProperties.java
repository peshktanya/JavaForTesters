package OOP.Lessons.Properties;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {

        Properties sys = System.getProperties();
        sys.list(System.out);
    }

}
