package Testy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testDwa {
    @Test
    public void findSeleniumTutorial() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumdemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[text()='Shop']")).click();
        WebElement seleniumProduct = driver.findElement(By.xpath("//h2[text()='WebDriver Java Selenium']"));
        Assert.assertTrue(seleniumProduct.isDisplayed());
    }
}
