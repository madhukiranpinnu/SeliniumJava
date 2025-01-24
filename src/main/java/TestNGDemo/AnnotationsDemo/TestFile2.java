package TestNGDemo.AnnotationsDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFile2 extends BaseTest{
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class-2 ");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("after Class-2 ");
    }
    @Test
    public void C(){
        System.out.println("C");
    }
    @Test
    public void D(){
        System.out.println("D");
    }
}
