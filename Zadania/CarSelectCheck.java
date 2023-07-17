package Zadania;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class CarSelectCheck {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);

        WebElement znajdz = driver.findElement(By.cssSelector("select"));
        Select auta = new Select(znajdz);
        auta.selectByValue("volvo");

        //zwraca wszystkie elementy w select
        List<WebElement> options = cars.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        SelectCheck selectCheck = new SelectCheck();
        System.out.println(selectCheck.checkOption("Audi",selectCar));
        System.out.println(selectCheck.checkOption("Jeep",selectCar));
    }
}
