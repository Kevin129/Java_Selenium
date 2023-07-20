package SprawdzanieStanuElementu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CzyObrazekSiePoprawnieZaladowal {
    WebDriver driver;
    @Test
    public void elementExistTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Szukany element
        //Sposób 1
        WebElement image = driver.findElement(By.tagName("img"));
        //Jeśli wysokość jest większa od zera to obrazek wyświetla sie poprawnie
        System.out.println(image.getAttribute("naturalHeight"));

        //Sposób 2
        /*WebElement imageFind = driver.findElement(By.tagName("img"));
        String height = imageFind.getAttribute("naturalHeight");

        Assert.assertEquals("0", height);*/
    }
}
