package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//ta metoda w JavaScript zastepuje metodę ,,SendKeys"
public class JavaScriptExecutorWpisywanie {
    @Test
    public void executeJavascript() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.manage().window().maximize();

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",basicPageLink);

        //lokalizuje atrybut na stronie
        WebElement firstName = driver.findElement(By.name("fname"));
        executor.executeScript("arguments[0].setAttribute('value','Kevin');",firstName);
    }
}
