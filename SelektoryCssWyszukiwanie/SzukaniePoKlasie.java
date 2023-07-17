package SelektoryCssWyszukiwanie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SzukaniePoKlasie {
    @Test
    public void findElements () {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Szukanie po klasie
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        //Szukanie po klasie
        By cssClass2 = By.cssSelector("[class='topSecret]");
        driver.findElement(cssClass2);
    }
}
