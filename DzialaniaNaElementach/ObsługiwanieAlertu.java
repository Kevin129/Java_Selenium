package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ObsługiwanieAlertu {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();


        //Wywołanie pierwszego alertu i zaakceptowanie go
        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();

        //Wywołanie i zaakapcetowanie kolejnego alertu
        driver.switchTo().alert();

    }
}
