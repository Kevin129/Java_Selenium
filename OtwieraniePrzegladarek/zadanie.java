package OtwieraniePrzegladarek;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

public class zadanie {

    @Test
    public void zadanie() {
        WebDriver driver = getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.pl");
    }

    public WebDriver getDriver(String browser) {
        switch (browser) {

            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotwicki_k\\Desktop\\Driver\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
                return new ChromeDriver();

            case "firefox":
                System.setProperty("webdriver.gecko.driver","C:\\Users\\kotwicki_k\\Desktop\\Driver\\FireFoxDriver\\geckodriver-v0.33.0-win32\\geckodriver.exe");
                return new FirefoxDriver();

            default:
                throw new InvalidArgumentException("Invalid browser name");
        }
    }
}
