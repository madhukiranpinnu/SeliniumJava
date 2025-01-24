package TestNGDemo.AssertionsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
    @Test
    public void Test(){
        Assert.assertTrue(false,"It is true");
        Assert.assertEquals(12,78);
    }
}
