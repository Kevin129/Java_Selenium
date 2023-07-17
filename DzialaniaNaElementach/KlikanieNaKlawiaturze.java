package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KlikanieNaKlawiaturze {
    @Test
    public void KlikanieKlawiatury () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

       WebElement KliknijMnie = driver.findElement(By.id("clickOnMe"));
        KliknijMnie.sendKeys(Keys.ENTER);

        /*WebElement tabulator = driver.findElement(By.name("username"));
        tabulator.click();
        tabulator.sendKeys(Keys.TAB);*/
    }
}
