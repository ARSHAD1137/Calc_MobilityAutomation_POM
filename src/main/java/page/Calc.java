package page;

import base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Calc extends Base {

    private AndroidDriver<AndroidElement> driver;

    public Calc(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_07")
    private MobileElement btn1;

    @AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_05")
    private MobileElement btn2;

    @AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_add")
    private MobileElement plusBtn;

    @AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_sub")
    private MobileElement subtrBtn;

    @AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_mul")
    private MobileElement multiBtn;

    @AndroidFindBy(id = "com.sec.android.app.popupcalculator:id/bt_equal")
    private MobileElement eqlBtn;

    public void add() {
        btn1.click();
        plusBtn.click();
        btn2.click();
        eqlBtn.click();
    }

    public void multi() {
        btn1.click();
        multiBtn.click();
        btn2.click();
        eqlBtn.click();
    }

    public void subtr(){
        btn1.click();
        subtrBtn.click();
        btn2.click();
        eqlBtn.click();
    }
}
