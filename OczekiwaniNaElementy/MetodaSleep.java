package OczekiwaniNaElementy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MetodaSleep {
    @Test
    public void sleep () throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait.html");
        driver.manage().window().maximize();

        //Klika na przycisk
        driver.findElement(By.id("clickOnMe")).click();
        //Czeka 5 sec na komunikat
        Thread.sleep(5000);
    }
}
