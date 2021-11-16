package test;

import base.BaseCalc;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import page.CalcPage;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcTest extends BaseCalc {



    @Test(priority = 1)
    public void additionOperation() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test1 = extent.createTest("Addition of two numbers");
        test1.log(Status.INFO, "Start addition of two numbers");

        cal.addition();

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

        cal.subtr();

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

        cal.multi();

        test3.log(Status.PASS, "Successfully pass multiplication test");

        String actualResult = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualResult,"35");
    }

    @AfterTest
    public void take_screenshot() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
        Date date = new Date();

        File file  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\Arshad\\Desktop\\Custom Batch QA\\Screenshots\\"+dateFormat.format(date)+"screenshot.png"));
    }
}
