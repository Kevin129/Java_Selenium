package Testy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testJeden {
    @Test
    public void openPage () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl");


        //wyszukuje ten dany komunikat z przyciskiem
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        //Klika na przycisk
        agreeButton.click();
        //znajdź pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadź wartość "Selenium" do pola
        searchField.sendKeys("Selenium");
        // Zasymuluj naciśnięcie prtzycisku "Enter"
        searchField.sendKeys(Keys.ENTER);
        // znaleźć rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());
    }
}
