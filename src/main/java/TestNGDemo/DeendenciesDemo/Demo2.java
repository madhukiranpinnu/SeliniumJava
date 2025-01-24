package TestNGDemo.DeendenciesDemo;

import org.testng.annotations.Test;

public class Demo2 {
    @Test(priority = 2)
    public void Test1(){
        System.out.println("Test 1");
    }
    @Test(priority = 1, dependsOnMethods = {"Test1"})
    public void Test2(){
        System.out.println("Test2");
    }
}
