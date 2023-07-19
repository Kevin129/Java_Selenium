package DzialaniaNaElementach;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PobranieTytułuStrony {
    @Test
    public void getInfo () {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Pobiera adres strony
        System.out.println(driver.getCurrentUrl());

        //Pobiera tytuł strony
        System.out.println(driver.getTitle());

    }
}
