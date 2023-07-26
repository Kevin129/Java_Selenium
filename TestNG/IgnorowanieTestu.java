package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnorowanieTestu {
    WebDriver driver;

    //dopisanie @ignore ignoruje test
    @Test @Ignore
    public void firstTest () {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait.html");
        driver.manage().window().maximize();


        WebElement clickOnMe = driver.findElement(By.id("clickOnMe"));
        clickOnMe.click();
        //Czeka na element 10 sekund
        //WebDriver wait jest dzieckiem fluent wait
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        driver.quit();
    }
}
