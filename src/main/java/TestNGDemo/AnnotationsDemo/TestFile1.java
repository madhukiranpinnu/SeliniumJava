package TestNGDemo.AnnotationsDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFile1 extends BaseTest {
    @Test
    public void A(){
        System.out.println("A");
    }
    @Test
    public void B(){
        System.out.println("B");
    }
}
