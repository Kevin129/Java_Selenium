package LokazliacjaElementow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class lokalizowanieElementów {
    @Test
    public void findElements () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("Tu wpisz adres strony, którą testujesz");
        driver.manage().window().maximize();

        //Wyszukuje dany element po ID
        By buttonId = By.id("clickOnMe"); // <- w zielonym podajemy nazwę id np: id="clickOnMe"
        WebElement clickOnMeButton = driver.findElement(buttonId);
        clickOnMeButton.click(); //<- klika element

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

        //Wyszukanie elementu po klasie
        WebElement findClass = driver.findElement(By.className("tu wklej nazwę klasy "));

        //Wyszukanie elementu po nazwie
        WebElement findName = driver.findElement(By.name("fname"));


        //Lokalizowanie po Tekście

        // Pierwszy sposób
        WebElement linkText = driver.findElement(By.linkText("tu wpisz szukaną nazwę"));
        linkText.click();

        //Drugi sposób
        By linkTekst = By.linkText("Tu wpisz szukaną nazwę");
        WebElement buttonLink = driver.findElement(linkTekst);
        buttonLink.click();

        //Wyszukuje po niepełnej nazwie szukanej rzeczy
        WebElement linkTekstCzesciowy = driver.findElement(By.partialLinkText("Tu wpisz szukane słowo"));
        linkTekstCzesciowy.click();
    }
}
