package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PobranieWartosciZUkrytegoElementu {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        WebElement paragraf = driver.findElement(By.cssSelector(".topSecret"));

        //Metoda 1
        System.out.println("By text: " + paragraf.getText());

        //Metoda 2
        System.out.println("By attribute value: " + paragraf.getAttribute("value"));

        //Metoda 3
        System.out.println("By attribute text content: " + paragraf.getAttribute("textContent"));
    }
}
