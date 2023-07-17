package DzialaniaNaElementach;

import Zadania.SelectCheck;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class WybieranieOpcjiSelect {

    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //zwraca wartośc tekstu, który znajduje się znacznikiem otwierającym i zamykającym
        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        System.out.println(basicPageLink.getText());


        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);

        //wybranie po ID, id zaczyna sie od 0
        cars.selectByIndex(2);

        //wybiera po tekście
        cars.selectByVisibleText("Saab");

        //wybiera po value
        cars.selectByValue("volvo");

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
