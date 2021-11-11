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

    //private AndroidDriver<AndroidElement> driver;

    public Calc(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.calculator2:id/digit_7")
    private MobileElement btn1;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_8")
    private MobileElement btn2;

    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    private MobileElement plusBtn;

    @AndroidFindBy(id = "com.android.calculator2:id/op_sub")
    private MobileElement subtrBtn;

    @AndroidFindBy(id = "com.android.calculator2:id/op_mul")
    private MobileElement multiBtn;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
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
