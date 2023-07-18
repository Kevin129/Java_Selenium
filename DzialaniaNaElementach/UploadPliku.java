package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadPliku {
    @Test
    public void select () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/fileupload.html");
        driver.manage().window().maximize();

        //pierwszy sposób
        /*WebElement plik = driver.findElement(By.id("myFile"));
        plik.sendKeys("C:\\Users\\kotwicki_k\\Desktop\\UploadPliku\\rozprawka.txt");*/

        // drugi sposób
        driver.findElement(By.id("myFile")).sendKeys("C:\\\\Users\\\\kotwicki_k\\\\Desktop\\\\UploadPliku\\\\rozprawka.txt");

    }
}
