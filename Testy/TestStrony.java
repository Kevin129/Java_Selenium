package Testy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TestStrony {
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
        wiadomoscTextArea.sendKeys((CharSequence) "Hokus pokus czary mary Tinki Winki to twój stary");

        WebElement mailText = driver.findElement(By.name("form_fields[Imię / nazwa firmy]"));
        mailText.sendKeys("Jan Kowalski");
    }
}

