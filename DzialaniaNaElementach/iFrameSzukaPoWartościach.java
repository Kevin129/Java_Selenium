package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrameSzukaPoWartościach {
    @Test
    public void UsuwanieTekstu () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.manage().window().maximize();

        //Znajduje element po wartości
        WebElement iframe = driver.findElement(By.cssSelector("[src='basics.html']"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.id("fname")).sendKeys("Kevin");

        //wraca do pierwotnegoj strony
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }
}
