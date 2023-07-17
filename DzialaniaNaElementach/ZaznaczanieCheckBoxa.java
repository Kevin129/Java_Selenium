package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZaznaczanieCheckBoxa {
    @Test
    public void Zaznaczanie () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        WebElement zaznacz = driver.findElement(By.name("gender"));
        zaznacz.click();

        //metody Css

        //driver.findElement(By.cssSelector("[type='radio']")).click();

        //driver.findElement(By.cssSelector("[value='male']")).click();
    }
}
