package TestNGDemo.ParrametersDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteParameterDemo {
    @Test
    @Parameters("Time")
    public void Test(String Time){
        System.out.println(Time);
    }
}
