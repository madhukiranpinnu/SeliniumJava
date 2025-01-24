package TestNGDemo.DeendenciesDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Demo1 {
    @Test
    @Ignore
    public void Test1(){
        System.out.println("Test1");
        System.out.println(5/0);
    }
    @Test(dependsOnMethods = {"Test1"})
    public void Test2(){
        System.out.println("Test2");
    }
    @Test
    public void Test3(){
        System.out.println("Test3");
    }
    @Test(dependsOnMethods = {"Test3"})
    public void Test4(){
        System.out.println("Test 4");
    }
}
