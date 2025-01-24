package TestNGDemo.AnnotationsDemo;

import org.testng.annotations.Test;

public class TestFile3 extends BaseTest {
    @Test(groups = {"mk"})
    public void E(){
        System.out.println("E");
    }
    @Test(groups = {"sl"})
    public void F(){
        System.out.println("F");
    }

}
