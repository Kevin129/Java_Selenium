package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iFrameSzukaPoIndeksie {
    @Test
    public void UsuwanieTekstu () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/iframe.html");
        driver.manage().window().maximize();

        //Podajemy nr indeksu frame, który nas interesuje, na stronie może byc kilka frame-ów
        driver.switchTo().frame(0);
        driver.findElement(By.id("fname")).sendKeys("Kevin");

        //wraca do pierwotnegoj strony
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
    }
}
