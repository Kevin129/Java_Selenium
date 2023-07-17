package SelectoryXpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selectors {
    @Test
    public void findElements () {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.manage().window().maximize();

        //Szukanie po ID
        By buttonId = By.xpath("//html/body/form[2]/input[1]");
        WebElement clickOnMe = driver.findElement(buttonId);
        clickOnMe.sendKeys("Cześć o");

        //Szukanie po name
        By firstName = By.xpath("//input[@name='fname']");
        WebElement firstNameInput = driver.findElement(firstName);

        //Szukanie po klasie
        By paraHidden = By.xpath("//p[@class='topSecret']");
        driver.findElement(paraHidden);

        //Szukanie po tagu
        By inputLocator = By.xpath("//input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

        //lokalizuje elementy z tagiem ,,a", dla którego wartośc jest równa wpisanemu tekstowi
        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
        WebElement schoolLink = driver.findElement(linkText);

        //lokalizuje element, który w nazwie zawiera podane słowo
        By partialLink = By.xpath("//a[contains(text(),'Visit')]");
        WebElement schoolPartial = driver.findElement(partialLink);

        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);

        //szuka wszystkich elementów
        By allXpath = By.xpath("//*");
        driver.findElement(allXpath);

        //szuka element inputa z wybranym indeksem
        By secondElement = By.xpath("(//input)[2]");
        driver.findElement(secondElement);

        //Szuka ostatniego elementu inputa
        By lastElement = By.xpath("(//input)[last()]");
        driver.findElement(lastElement);

        //Szuka atrubutu z podanym słowem w nazwie, zwróci nam pierwszy element
        By elementWithAttribute = By.xpath("//*[@name]");
        driver.findElement(elementWithAttribute);

        //lokalizowanie wartośći za pomocą xpath korzystając z wartości atrybutów
        By attrEq = By.xpath("//button[@id='clickOnMe']");
        driver.findElement(attrEq);

        By attrNotEq = By.xpath("//*[@id!='clickOnMe']");
        driver.findElement(attrNotEq);

        By attrCont = By.xpath("//*[contains(@name,'ame')]");
        driver.findElement(attrCont);

        By starsWith = By.xpath("//*[starts-with(@name,'user')]");
        driver.findElement(starsWith);

        By endWith = By.xpath("//*[substring(@name,string-length(@name)-string-length('name')+1)='name']");
        driver.findElement(endWith);

        //Znajduje listę i jej elementu z tagiem ul
        By child = By.xpath("//div/child::ul");
        driver.findElements(child);

        //Znajduje wszystkie stępne elementy listy z tagiem ul
        By desc = By.xpath("//div/descendant::ul");
        driver.findElement(desc);

        //Znajduje bezpośrednio rodzica naszego tagu
        By parent = By.xpath("//div/../..");
        driver.findElement(parent);

        //Znajduje wszytskie tagi nadrzędne
        By asc = By.xpath("//div/ancestor::*");
        driver.findElement(asc);

        //znajduje tagi, które znajdują sie w tej samej strukturze co obrazek
        By foll = By.xpath("//img/following::*");
        driver.findElement(foll);

        //znajduje wszystkie tagi,które znajdują sie po wybranym elemencie
        By follsib = By.xpath("//img/following-sibling::*");
        driver.findElement(follsib);

        //znajduje elementy, które znajdują sie przed obrazkiem
        By prec = By.xpath("//img/preceding::*");
        driver.findElement(prec);

        //znajduje elementy, które są na tym samym poziomie co obrazek
        By precSib = By.xpath("//img/preceding-sibling::*");
        driver.findElement(precSib);

        //szuka dwóch elementów znaczników a i inputów
        By divsAndLinks = By.xpath("//a | //div");
        driver.findElement(divsAndLinks);

        //Szuka dwóch elementów
        By andOp = By.xpath("//input[@name='fname' and @id='fname']");
        driver.findElement(andOp);

        //Szuka dwóch elementów
        By orOp = By.xpath("//input[@name='fname' or @id='fname']");
        driver.findElement(orOp);
    }
}
