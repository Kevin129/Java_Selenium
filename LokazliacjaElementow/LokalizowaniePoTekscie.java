package LokazliacjaElementow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LokalizowaniePoTekscie {
    @Test
    public void findElements () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        // Pierwszy sposób
        WebElement linkText = driver.findElement(By.linkText("Visit W3Schools.com!"));
        linkText.click();

        //Drugi sposób
        By linkTekst = By.linkText("Visit W3Schools.com!");
        WebElement buttonLink = driver.findElement(linkTekst);
        buttonLink.click();

        //Wyszukuje po niepełnej nazwie szukanej rzeczy np" Visit W3Schools.com!, a poniżej jedno słowo
        WebElement linkTekstCzesciowy = driver.findElement(By.partialLinkText("visit"));
        linkTekstCzesciowy.click();
    }
}

