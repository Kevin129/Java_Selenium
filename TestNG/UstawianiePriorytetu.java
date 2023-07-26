package TestNG;

import org.testng.annotations.Test;

public class UstawianiePriorytetu {

    @Test(priority = 2)
    public void firstTest () {
        System.out.println("I am first Test");
    }
    @Test(priority = 0)
    public void secondTest () {
        System.out.println("I am second Test");
    }
    @Test(priority = 1)
    public void thirdTest () {
        System.out.println("I am Third test");
    }
}
