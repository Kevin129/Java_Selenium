package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class PodwojneKliekniecieMysza {
    @Test
    public void action () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/doubleclick.html");
        driver.manage().window().maximize();

        //Metoda Action
        Actions action = new Actions(driver);
        action.contextClick().perform();

        //Klika dwukrotnie na element z podanym atrybutem, z wykorzystaneim metody Action
        WebElement button = driver.findElement(By.id("bottom"));
        action.doubleClick(button).perform();
    }
}
