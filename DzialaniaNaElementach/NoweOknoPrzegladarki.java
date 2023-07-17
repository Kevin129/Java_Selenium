package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

public class NoweOknoPrzegladarki {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //znajduje nazwę okna
        String currentWindow = driver.getWindowHandle();

        driver.findElement(By.id("newPage")).click();
        Set<String> windowNames = driver.getWindowHandles();

        for (String window : windowNames) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
            }
        }
        //driver.findElement(By.name("q")).sendKeys("Selenium");

    }
}
