package OtwieraniePrzegladarek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InternetExplorer {
    @Test
    public void openInternetexplorerPage() {
        System.setProperty("webdriver.ie.driver", "tu wpisz link do drivera ");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.pl");
    }
}
