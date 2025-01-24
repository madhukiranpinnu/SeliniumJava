package TestNGDemo.ParrametersDemo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalDemo {
    @Test
    @Parameters("op")
    public void Test(@Optional("io")String op){
        System.out.println(op);
    }
}
