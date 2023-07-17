package SelektoryCssWyszukiwanie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    @Test
    public void findElements () {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Szukanie po ID
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        //Szukanie po klasie
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        //Szukanie po Tagu
        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("Cześć");

        //Szukanie po name
        By cssName = By.cssSelector("[name = `fname']");
        driver.findElement(cssName);

    }
}
