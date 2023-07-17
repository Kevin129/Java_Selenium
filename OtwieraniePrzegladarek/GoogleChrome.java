package OtwieraniePrzegladarek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleChrome {

    @Test
    public void openGooglePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kotwicki_k\\Desktop\\Driver\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl");
    }
}

