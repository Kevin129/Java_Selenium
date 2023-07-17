package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KlikanieNaElementy {
    @Test
    public void Klikanie () {
        for (int i =0; i < 2; i++) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.manage().window().maximize();


            WebElement kliknij = driver.findElement(By.linkText("Podstawowa strona testowa"));
            kliknij.click();

            WebElement KliknijMnie = driver.findElement(By.id("clickOnMe"));
            KliknijMnie.click();

            driver.quit();

        }
    }
}
