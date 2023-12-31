package Testy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ebutikLogowanie {
    @Test
    public void shop() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://ebutik.pl/");
        driver.manage().window().maximize();

        By zaloguj = By.className("fixtop-hidden");
        WebElement kliknijZaloguj = driver.findElement(zaloguj);
        kliknijZaloguj.click();

        By login = By.id("user_login");
        WebElement wpiszLogin = driver.findElement(login);
        wpiszLogin.sendKeys("jan700460@gmail.com");

        By password = By.id("user_pass");
        WebElement wpiszPassword = driver.findElement(password);
        wpiszPassword.sendKeys("KowalskiJan10");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'ZAPISZ SIĘ')]")));
        cookieButton.click();

        }
    }

