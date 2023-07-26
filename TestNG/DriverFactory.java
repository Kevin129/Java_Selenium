package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver==null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }
}
