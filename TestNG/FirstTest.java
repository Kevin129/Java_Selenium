package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class FirstTest extends BaseTest {
    WebDriver driver;
    @Test
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

    @Test
    public void secondTest () {

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
    public void waitForElementToExist (By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

        wait.until(new Function<WebDriver, Boolean>(){
            @Override
            public Boolean apply(WebDriver driver1) {
                List<WebElement> elements = driver1.findElements(locator);
                if (elements.size()>0) {
                    System.out.println("Element jest na stronie");
                    return true;
                } else {
                    System.out.println("Elementu nie ma na stronie");
                    return false;
                }
            }
        });
    }

}
