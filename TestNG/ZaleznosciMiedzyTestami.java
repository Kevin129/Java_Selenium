package TestNG;

import org.testng.annotations.Test;

public class ZaleznosciMiedzyTestami {

    //Aby uruchomić pierwszy test, musi zostac najpierw uruchomiony trzeci test
    @Test(dependsOnMethods = {"thirdTest"})
    public void firstTest () {
        System.out.println("I am first Test");
    }
    //Aby uruchomić drugi test, musi zostac najpierw uruchomiony pierwszy test
    @Test(dependsOnMethods = {"firstTest"})
    public void secondTest () {
        System.out.println("I am second Test");
    }
    @Test
    public void thirdTest () {
        System.out.println("I am Third test");
    }
}
