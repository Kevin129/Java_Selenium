package WebDriverManagerOpenWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class InternetExplorer {
    @Test
    public void openPage () {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.pl");
    }
}
