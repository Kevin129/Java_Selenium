package TestNG;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ScreenPrzyFailTest implements ITestListener {
    @Override
    public void onTestSuccess (ITestResult iTestResult) {
    }

    @Override
    public void onTestFailure (ITestResult iTestResult) {

        //Robi screena gdy test zakończy się nie powodzeniem
        WebDriver driver = DriverFactory.getDriver();
        int randomNumber = (int) (Math.random()*100);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File before = screenshot.getScreenshotAs(OutputType.FILE);
        String fileName = "failedTest" + randomNumber + ".png";
        try {
            FileUtils.copyFile(before, new File("src/test/resources" + fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
