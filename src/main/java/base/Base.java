package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static WebDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("uiautomator2ServerLaunchTimeout",100000);
        cap.setCapability("adbExecTimeout",90000);
        cap.setCapability("newCommandTimeout", 120);
        cap.setCapability(AndroidMobileCapabilityType.ADB_EXEC_TIMEOUT, 60000);
        cap.setCapability("androidInstallTimeout", 180000);

        driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
    }

}
