package OtwieraniePrzegladarek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OtwieranieFireFox {
    @Test
    public void openFirefoxPage () {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\kotwicki_k\\Desktop\\Driver\\FireFoxDriver\\geckodriver-v0.33.0-win32\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.pl");
    }
}
