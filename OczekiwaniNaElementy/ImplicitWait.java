package OczekiwaniNaElementy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    @Test
    public void sleep () {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //Gdy nasz driver nie będzie w stanie znaleźć jakiego emelentu, to nie wyrzuci wyjątku od razu,
        // tylko przez 10 sec będzie sprawdzał czy ten element pojawił sie na stronie
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait.html");
        driver.manage().window().maximize();

        //Klika na przycisk
        driver.findElement(By.id("clickOnMe")).click();


    }
}
