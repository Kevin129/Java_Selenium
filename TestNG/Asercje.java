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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

//Służą do sprawdzania czy nasz aplikacja działa poprawnie, czy aktualny rezultat jest zgodny z oczekiwanym
public class Asercje extends BaseTest{
    WebDriver driver;

    @Test
    public void firstTest () {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForElementToExist(By.cssSelector("p"));

        WebElement para = driver.findElement(By.cssSelector("p"));

        Assert.assertEquals(para.isDisplayed(),true);
        Assert.assertTrue(para.isDisplayed(),"Element is not displayed");
        //Sprawdza czy tekst coś zawiera i czy zaczyna się od ,,Dopiero"
        Assert.assertEquals(para.getText(), "Dopiero","Teksty są różne"); //Ta asercja failuje
        Assert.assertTrue(para.getText().startsWith("Dopiero"));
        //Sprawdza czy nie zaczyna sie od ,,Pojawiłem"
        Assert.assertFalse(para.getText().startsWith("Pojawiłem"));
        Assert.assertEquals(para.getText(),"Dopiero sie pojawiłem");

        driver.quit();
    }

    @Test
    public void secondTest () {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("clickOnMe")).click();
        waitForElementToExist(By.cssSelector("p"));

        WebElement para = driver.findElement(By.cssSelector("p"));

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(para.isDisplayed(),true);
        softAssert.assertTrue(para.isDisplayed(),"Element is not displayed");
        //Sprawdza czy tekst coś zawiera i czy zaczyna się od ,,Dopiero"
        softAssert.assertEquals(para.getText(), "Dopiero","Teksty są różne"); //ta asercja failuje
        softAssert.assertTrue(para.getText().startsWith("Dopiero"));
        //Sprawdza czy nie zaczyna sie od ,,Pojawiłem"
        softAssert.assertFalse(para.getText().startsWith("Pojawiłem"));
        softAssert.assertEquals(para.getText(),"Dopiero sie pojawiłem","Druga asercja"); //ta asercja failuje

        driver.quit();
        softAssert.assertAll();
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
