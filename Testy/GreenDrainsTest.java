package Testy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.sql.Driver;
import java.util.Set;

public class GreenDrainsTest {
    public static void main(String[] args) {

        // Inicjalizacja obiektu WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Krok 1: Wejście na stronę https://www.greendrains.pl/
        driver.get("https://www.greendrains.pl/");

        // Krok 2: Wejście w zakładkę "Kontakt"
        WebElement kontaktTab = driver.findElement(By.linkText("Kontakt"));
        kontaktTab.click();

        WebElement wiadomoscTextArea = driver.findElement(By.name("form_fields[message]"));
        wiadomoscTextArea.sendKeys((CharSequence) "Za chwilę zobaczysz postać z bajki");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Otwórz nową kartę z obrazkiem
        String imageUrl = "https://bi.im-g.pl/im/1/4182/z4182871IH.jpg";
        String jsCode = "window.open('" + imageUrl + "','_blank');";
        ((JavascriptExecutor) driver).executeScript(jsCode);

        // Przełącz się na nową kartę
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
        }
    }
}
