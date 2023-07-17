package LokazliacjaElementow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WyszukiwaniePoID {
    @Test
    public void findElements () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Wyszukuje dany element po ID
        By buttonId = By.id("clickOnMe"); // <- w zielonym podajemy nazwę id id="clickOnMe"
        WebElement clickOnMeButton = driver.findElement(buttonId);
        clickOnMeButton.click(); //<- klika element

    }
}
