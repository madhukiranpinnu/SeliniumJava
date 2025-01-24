package TestNGDemo.ParrametersDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAndSuite {
    @Test
    @Parameters("lo")
    public void Test(String lo){
        System.out.println(lo);
    }
}
