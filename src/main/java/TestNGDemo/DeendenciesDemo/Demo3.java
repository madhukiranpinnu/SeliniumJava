package TestNGDemo.DeendenciesDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Demo3 {
    @Test
    @Ignore
    public void Test1(){
        System.out.println("Test 1");
    }
    @Test(dependsOnMethods = {"Test1"}, ignoreMissingDependencies = true)
    public void Test2(){
        System.out.println("Test 2");
    }
    @Test
    @Ignore
    public void Test3(){
        System.out.println("Test3");
    }
    @Test(dependsOnMethods = {"Test3"},ignoreMissingDependencies=false)
    public void Test4(){
        System.out.println("Test 4");
    }
}
