package OczekiwaniNaElementy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class DodawanieWarunkuZaPomocaLambda {
    WebDriver driver;
    @Test
    public void sleep () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();
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

        //wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));

        //Jesli elementu nie ma na stronie to co 1sec otrzymamy komunikat ,,Elementu nie ma na stronie" i tak przez 10 ces
        waitForElementToExist(By.cssSelector("pa"));
    }

    public void waitForElementToExist (By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

        wait.until((driver) -> {
                List<WebElement> elements = driver.findElements(locator);
                if (elements.size()>0) {
                    System.out.println("Element jest na stronie");
                    return true;
                } else {
                    System.out.println("Elementu nie ma na stronie");
                    return false;
                }
        });
    }
}
