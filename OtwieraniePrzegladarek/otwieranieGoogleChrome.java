package OtwieraniePrzegladarek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class otwieranieGoogleChrome {
    @Test
    //Otwieranie Google Chrome
    public void openGooglePage() {
        System.setProperty("webdriver.chrome.driver", "podaj ścieżkę lokalizacji drivera");
        WebDriver driver = new ChromeDriver();
        driver.get("Podaj adres strony, którą chcesz otworzyć");

    }
}
