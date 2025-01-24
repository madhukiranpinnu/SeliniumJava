package TestNGDemo.Listners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListnersTest.class)
public class TestClass {
    @Test
    public void Test1(){
        System.out.println("Test Passed");
    }
    @Test
    public void Test2(){
        System.out.println(4/0);
    }
    @Test(dependsOnMethods = {"Test2"})
    public void Test3(){
        System.out.println("Skipped");
    }
}
