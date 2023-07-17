package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Używamy tej metody ,,JavaScript", gdy podstawowa metoda ,,click" nie działa
public class JavaScriptExecutorKlikanie {
    @Test
    public void executeJavascript() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.manage().window().maximize();

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));

        //poniżej jest Javascript executor, z odwołaniem do odpowiedniego interfejsu, i z kastowanym driverem
        JavascriptExecutor executor = (JavascriptExecutor) driver;

        //wywołanie metody execute script, podajemy argument i wywowłujemy metodę ,,click"
        executor.executeScript("arguments[0].click();",basicPageLink);

    }
}
