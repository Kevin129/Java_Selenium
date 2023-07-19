package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class KliekaniePrawymPrzyciskiemMyszy {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);

        //Klika prawym przyciskiem myszy
       /*actions.contextClick().perform();*/

        //Klika na wybrany przycisk, w nawiasie podajemy atrybut
        actions.contextClick(driver.findElement(By.id("myFile"))).perform();
    }
}
