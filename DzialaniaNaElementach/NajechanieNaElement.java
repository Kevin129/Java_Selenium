package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;


public class NajechanieNaElement {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Metoda Actions
        Actions actions = new Actions(driver);

        //Wyszukuje wybrany nagłówek
        WebElement heading = driver.findElement(By.tagName("h1"));

        //najeżdza na element
        actions.moveToElement(heading).perform();
    }
}
