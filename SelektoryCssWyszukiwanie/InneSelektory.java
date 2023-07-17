package SelektoryCssWyszukiwanie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InneSelektory {
    @Test
    public void findElements () {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Zwraca pierwszy element
        /*By all = By.cssSelector("*");
        driver.findElement(all);*/

        //Zwraca wszystkie elementy na stronie po dodaniu s w findelement
        By alls = By.cssSelector("*");
        driver.findElements(alls);

        By ulInsideDiff = By.cssSelector("div ul");
        By trInTable = By.cssSelector("Table tr");
        By trInBody = By.cssSelector("tbody tr");

        driver.findElement(ulInsideDiff);
        driver.findElement(trInTable);
        driver.findElement(trInBody);

        By firstChildUlInDiv = By.cssSelector("div > ul");
        By firstChildTrInBody = By.cssSelector("tbody > tr");

        driver.findElement(firstChildUlInDiv);
        driver.findElement(firstChildTrInBody);

        //Zwraca pierwszy formularz po tagu label
        By findFormularz = By.cssSelector("label + form");
        driver.findElement(findFormularz);

        //Zwraca wszystkie formularze po tagu label
        By findAllFormularz = By.cssSelector("label ~ form");
        driver.findElement(findAllFormularz);

        By attrTag = By.cssSelector("input[name='fname]");
        By attrContains = By.cssSelector("[name*='name']");
        By attrStarts = By.cssSelector("[name^='f']");
        By attrEnds = By.cssSelector("[name$= 'name']");

        driver.findElement(attrTag);
        driver.findElement(attrContains);
        driver.findElement(attrStarts);
        driver.findElement(attrEnds);

        By firstChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)");

        driver.findElement(firstChild);
        driver.findElement(lastChild);
        driver.findElement(thirdChild);

    }
}

