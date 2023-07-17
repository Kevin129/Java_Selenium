package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PobranieWartosciZPolaTekstowego {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.clear();
        usernameInput.sendKeys("admin");

        //pobiera wartość z pola tekstowego
        System.out.println(usernameInput.getAttribute("value"));

    }
}
