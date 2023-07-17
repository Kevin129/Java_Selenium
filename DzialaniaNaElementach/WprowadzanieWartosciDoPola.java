package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WprowadzanieWartosciDoPola {
    @Test
    public void tekst() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();


            WebElement Tekst = driver.findElement(By.id("fname"));
            Tekst.sendKeys("Cześć");

            //Usuwanie tekstu z pola
            Tekst.clear();
    }
}

