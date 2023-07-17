package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BasicActionTest {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        System.out.println(basicPageLink.getText());
        basicPageLink.click();

        driver.findElement(By.id("fname")).sendKeys("Bartek");
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.clear();
        usernameInput.sendKeys("admin");

        System.out.println(usernameInput.getText());
        System.out.println(usernameInput.getAttribute("value"));
        usernameInput.sendKeys(Keys.ENTER);

        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();

        driver.switchTo().alert().accept();
    }
}
