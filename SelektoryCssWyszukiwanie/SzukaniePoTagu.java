package SelektoryCssWyszukiwanie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SzukaniePoTagu {
    @Test
    public void findElements () {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Szukanie po Tagu
        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag);

        //Szukanie po Tagu, mozna tez od razu coś wypisać w tym polu tekstowym
        By cssTagi = By.cssSelector("input");
        driver.findElement(cssTagi).sendKeys("Cześć");
    }
}
