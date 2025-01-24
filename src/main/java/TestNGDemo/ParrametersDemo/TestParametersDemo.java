package TestNGDemo.ParrametersDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersDemo {
    @Test
    @Parameters("Value")
    public void Test(String Value){
        System.out.println(Value);
    }
}
