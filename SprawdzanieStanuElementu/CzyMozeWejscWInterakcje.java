package SprawdzanieStanuElementu;
//Sprawdza czy element jest gotowy na interakcje
//Czy nie jest wyszarzony itd

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CzyMozeWejscWInterakcje {
    WebDriver driver;
    @Test
    public void elementExistTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Szukany element, który działana stronie
        System.out.println(driver.findElement(By.tagName("button")).isEnabled());
    }


    //True - są dostepne na stronie
    //False - nie są dostępne na stronie
    public boolean elementExist(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }
}
