package SprawdzanieStanuElementu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CzyElementIstniejeDwaNaStronie {
    WebDriver driver;
    @Test
    public void elementExistTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Szukane elementy pierwszej moetody
        System.out.println(elementExist(By.tagName("p")));
        System.out.println(elementExist(By.id("topSecret")));

        //Szukane elementy drugiej metody
        System.out.println(elementExistSecond(By.tagName("p")));
        System.out.println(elementExistSecond(By.id("topSecret")));

    }

    //Metoda 1 (Z wykorzystaniem Try catch)
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

    //Metoda 2 (Z wykorzystaniem listy)
    // 1 - są dostepne na stronie
    // 0 - nie są dostępne na stronie
        public boolean elementExistSecond(By locator) {
            return driver.findElements(locator).size() > 0;
    }
}

