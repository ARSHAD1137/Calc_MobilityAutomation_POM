package test;

import base.Base;
import org.testng.annotations.Test;
import page.Calc;

public class CalcTest extends Base {

    @Test(priority = 1)
    public void additionOperation() throws InterruptedException {
        Calc cal = new Calc(driver);
        cal.add();
    }

    @Test(priority = 2)
    public void subtraction() throws InterruptedException{
        Calc cal = new Calc(driver);
        cal.subtr();
    }

    @Test(priority = 3)
    public void multiplication() throws InterruptedException{
        Calc cal = new Calc(driver);
        cal.multi();
    }
}
