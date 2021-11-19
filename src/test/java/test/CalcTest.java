package test;

import base.BaseCalc;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import page.CalcPage;


public class CalcTest extends BaseCalc {

    public static final Logger LOG = LogManager.getLogger(CalcTest.class);

    @Test(priority = 1)
    public void additionOperation() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test1 = extent.createTest("Addition of two numbers");
        test1.log(Status.INFO, "Start addition of two numbers");
        LOG.info("Addition of two numbers");
        cal.addition();
        test1.log(Status.PASS, "Successfully pass addition test");
        cal.clr();
    }

    @Test(priority = 2)
    public void subtraction() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test2 = extent.createTest("Subtraction of two numbers");
        test2.log(Status.INFO, "Start subtraction of two numbers");
        LOG.info("Subtraction of two numbers");
        cal.subtr();
        test2.log(Status.PASS, "Successfully pass subtraction test");
        cal.clr();
    }

    @Test(priority = 3)
    public void multiplication() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test3 = extent.createTest("Multiplication of two numbers");
        test3.log(Status.INFO, "Start multiplication of two numbers");
        LOG.info("Multiplication of two numbers");
        cal.multi();
        test3.log(Status.PASS, "Successfully pass multiplication test");
        cal.clr();
    }

    @Test(priority = 4)
    public void division() throws InterruptedException {
        CalcPage cal = new CalcPage(driver);
        ExtentTest test4 = extent.createTest("Division of two numbers");
        test4.log(Status.INFO, "Start division of two numbers");
        LOG.info("Division of two numbers");
        cal.divis();
        test4.log(Status.PASS, "Successfully pass division test");
    }
}
