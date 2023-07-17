package Testy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testTrzy {
    @Test
    public void findSeleniumTutorial() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.greendrains.pl/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[text()='Kontakt']")).click();


    }
}

