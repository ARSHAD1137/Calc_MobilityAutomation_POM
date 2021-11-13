package test;

import base.BaseCalc;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CalcPage;

public class CalcTest extends BaseCalc {



    @Test(priority = 1)
    public void additionOperation() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test1 = extent.createTest("Addition of two numbers");
        test1.log(Status.INFO, "Start addition of two numbers");

        cal.addition();

        test1.log(Status.PASS, "Successfully pass addition test");

        String actualResult = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();
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

        String actualResult = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();
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

        String actualResult = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualResult,"35");
    }
}
