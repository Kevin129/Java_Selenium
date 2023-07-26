package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

// Wykonuje kod, gdy nasz test zakończy sie niepowodzeniem, sukcesem lub sie rozpoczyna

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am starting test");
    }
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

    @Override
    public void onTestSkipped (ITestResult iTestResult) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage (ITestResult iTestResult) {
    }

    @Override
    public void onStart (ITestContext iTestContext) {
    }

    @Override
    public void onFinish (ITestContext iTestContext) {
    }

}
