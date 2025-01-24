package TestNGDemo.AssertionsDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    @Test
    public void Test1(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(10,10,"Both are not equal");
        softAssert.assertEquals(12,78,"Both are not equal");
        softAssert.assertTrue(false,"Not True");
        softAssert.assertAll();
    }
}
