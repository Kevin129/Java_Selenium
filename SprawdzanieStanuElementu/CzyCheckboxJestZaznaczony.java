package SprawdzanieStanuElementu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CzyCheckboxJestZaznaczony {
    WebDriver driver;
    @Test
    public void elementExistTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Szukany element
        WebElement checkBox = driver.findElement(By.cssSelector("[type='checkbox']"));

        //Sprawdza czy jest zaznaczony
        System.out.println(checkBox.isSelected());
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
