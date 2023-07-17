package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrameSzukaPoStringu {
    @Test
    public void UsuwanieTekstu () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.manage().window().maximize();

        //używamy tylko w przypadku, gdy iframe posiada id lub name
        driver.switchTo().frame("wartość id lub wartość name");
        driver.findElement(By.id("fname")).sendKeys("Kevin");

        //wraca do pierwotnegoj strony
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }
}
