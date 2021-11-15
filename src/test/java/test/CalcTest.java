package test;

import base.BaseCalc;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import page.CalcPage;

import java.io.File;
import java.io.IOException;

public class CalcTest extends BaseCalc {

    private static final Logger Log = LogManager.getLogger(CalcTest.class);

    @Test(priority = 1)
    public void additionOperation() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test1 = extent.createTest("Addition of two numbers");
        test1.log(Status.INFO, "Start addition of two numbers");
        Log.info("Addition test is started");

        cal.addition();

        Log.info("Addition test completed");
        test1.log(Status.PASS, "Successfully pass addition test");

        String actualResult = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualResult,"12");
    }

    @Test(priority = 2)
    public void subtraction() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test2 = extent.createTest("Subtraction of two numbers");
        test2.log(Status.INFO, "Start subtraction of two numbers");
        Log.info("Subtraction test is started");

        cal.subtr();

        Log.info("Subtraction test is completed");
        test2.log(Status.PASS, "Successfully pass subtraction test");

        String actualResult = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualResult,"2");
    }

    @Test(priority = 3)
    public void multiplication() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test3 = extent.createTest("Multiplication of two numbers");
        test3.log(Status.INFO, "Start multiplication of two numbers");
        Log.info("Multiplication test is started");

        cal.multi();

        Log.info("Multiplication test completed");
        test3.log(Status.PASS, "Successfully pass multiplication test");

        String actualResult = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualResult,"35");
    }

    @AfterTest
    public void take_screenshot() throws IOException {
        File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\Arshad\\IdeaProjects\\Calc_MobilityAutomation_POM\\screenshots\\screenshot.jpg"));
    }
}
