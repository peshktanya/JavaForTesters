package OOP.Lessons.Properties;

public class SetPropertyForWebDriver {
    public static void main(String[] args) {
        if(!System.getProperties().containsKey("webdriver.chrome.driver")){
            String chromeDriverLocation
                    = "C:\\WebDriver\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        }
        System.out.println("Get Property : " + System.getProperties().get("webdriver.chrome.driver"));
    }
}
