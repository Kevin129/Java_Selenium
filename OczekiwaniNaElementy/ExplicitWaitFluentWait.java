package OczekiwaniNaElementy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitFluentWait {
    @Test
    public void sleep () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("clickOnMe")).click();

        //FluentWait nie ignoruje wyjątków jak WebDriverWait, musimy dodać wyjątki
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        //Ignoruje wyjątek
        wait.ignoring(NoSuchElementException.class);

        //Definiuje czas oczekiwania
        wait.withTimeout(Duration.ofSeconds(10));

        //Sprawdza co sekundę w trakcie tych 10 sekund
        wait.pollingEvery(Duration.ofSeconds(1));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));
    }
}
