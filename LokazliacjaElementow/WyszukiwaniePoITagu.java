package LokazliacjaElementow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WyszukiwaniePoITagu {
    @Test
    public void findElements () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Wyszukanie elementu po tagu
        WebElement findInput = driver.findElement(By.tagName("Tu wpisz nazwę taga np: input"));

        //Wyszukuje wszystkie elementy strony o podanym tagu np: input
        By inputLocator = By.tagName("Input");
        WebElement input = driver.findElement(inputLocator);
        List<WebElement> inputs = driver.findElements(inputLocator);

        //Wypisuje tekst do pierwszego inputa
        input.sendKeys("Cześć");

        //wypisuje długośc listy czyli ile jest inputów
        System.out.println(inputs.size());
    }
}
