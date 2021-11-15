package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExtentReportCalc{

    public ExtentHtmlReporter htmlCalcReporter;
    public ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        htmlCalcReporter = new ExtentHtmlReporter("C:\\Users\\Arshad\\IdeaProjects\\Calc_MobilityAutomation_POM\\extentReport\\extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlCalcReporter);
    }

    @AfterSuite
    public void reportTeardown() {
        extent.flush();
    }
}
